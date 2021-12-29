package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.model.order;
import com.model.shoe;
import com.repo.OrderRepo;
import com.service.UserService;
import com.service.orderService;
import com.service.shoeSevice;

@RestController
@RequestMapping("/mainapp")
public class MainApp {
	@Autowired

	
	  private UserService us;
	  ArrayList<User> al = new ArrayList<>();
	  
	  
	  @PostMapping("/login") 
	  public ModelAndView loginvalid(@RequestParam("uname") String
	  email, @RequestParam("pass") String pass, ModelMap map,HttpSession session) {
		  ModelAndView modelAndView = new ModelAndView();
	  String result=us.LoginValid(email, pass);
	  System.out.println(result);
	  session.setAttribute("email", email);
	 
	  if(result.equals("user")) {
		  System.out.println("Inside");
		  modelAndView.setViewName("viewShoes");
		  
	  }
	  else if(result.equals("Admin")){
		   modelAndView.setViewName("ViewUsers");
	  }else {
		  modelAndView.setViewName("login");
	  }
	 
	    return modelAndView;
	  
	  }
	
	  @GetMapping("/registerpage") 
	  public ModelAndView RegisterPage() { 
		
		  ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("register");
			    return modelAndView;
	
	  
	  }
	  
	  @PostMapping("/register") 
	  public ModelAndView RegisterValid( User user) { 
		  ModelAndView modelAndView = new ModelAndView();
		 
		  if( us.saveUser(user)==false) {
			  modelAndView.setViewName("register");
		  }
		  modelAndView.setViewName("success");
		  return modelAndView;
	  
	  }
	  
	  

	 @GetMapping("/list") 
	  @ResponseBody
	public List<User> loadData(ModelMap mp) {
		 mp.put("map",us.loadUser());
		 System.out.println(us.loadUser());
		return us.loadUser();
		
		
		 
	 }
	 
	
	  @GetMapping("/finduser/{uname}")
		  @ResponseBody
	  public String finduser(@PathVariable("uname")String name) {
		  if(us.FindUser(name)) {

			  System.out.println("Exists");
			  return "Exists";
		  }
		  System.out.println("Does Not Exists");
		  return "Does Not Exists";
	  
	  }
	 
	  @GetMapping("/ViewUsers")
		public ModelAndView ViewUsers (ModelMap mp) {
		  System.out.println(us.loadUser());
		  mp.put("users", us.loadUser());
		  ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("ViewUsers");
		    return modelAndView;
		}
	  
	  
	  @GetMapping("/deleteuser/{uname}")
	  @ResponseBody
  public String DeleteUser(@PathVariable("uname")String name) {
	  if(us.DeleteUser(name)) {

		  System.out.println("Deleted");
		  return "Deleted";
	  }
	  System.out.println("Unable to Delete User Does Not Exists");
	  return " Unable to Delete User Does Not Exists";
  
  }
 
	  @GetMapping("/update/{uname}/{email}/{pass}/{city}") 
	  @ResponseBody
	  public String updateValue(@PathVariable("uname")
	  String name, @PathVariable("pass") String password,@PathVariable("email")
	  String email, @PathVariable("city") String city) { 
		
		  if( us.UpdateUser(name, email, password, city)) {
			  return "User Updated Successfully";
		  }
		return "Error While Updating ,User Doesnot Exists ";
	  
	  }
	  @Autowired
	  private shoeSevice ss;
	  
	  @GetMapping("/addShoes")
	  public ModelAndView addShoes( ) {
		
		 ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("AddShoesjsp");
		    return modelAndView;
		  
	  }
	  @PostMapping("/addShoes")
	  public ModelAndView addShoes( shoe sh ,ModelMap mp) {
		 String result= ss.AddShoes(sh);
		 mp.put("result",result);
		 ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("success");
		    return modelAndView;
		  
	  }
	  
	  @GetMapping("/ViewShoe/{id}")
	  public ModelAndView GetUpdate(@PathVariable String id,ModelMap model) {
		  
		// List<shoe> result= ss.FindById(id);
		  System.out.println(ss.FindDataById(id));
		  model.put("product", ss.FindDataById(id));
		 ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("EditProducts");
		    return modelAndView;
		  
	  }
	  
	  @PostMapping("/UpdateShoe/{id}")
	  public ModelAndView Update(@PathVariable String id,shoe sh,ModelMap map) {
		  System.out.println(sh);
		  
		 String result= ss.Update(id,sh);
		 map.put("result",result);
		 
		 ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("success");
		    return modelAndView;
		  
	  }
	  @GetMapping("/deleteShoe/{id}")
	  public String delete(@PathVariable String id) {
		 String result= ss.Delete(id);
		return result;
		  
	  }
	  
	  @GetMapping("/viewShoes")
	  public ModelAndView list1(ModelMap model){
		  List<shoe> list=ss.findAll();
		 
		  if(list.isEmpty()) {
			  model.put("shoe", "NULL");
			 
		  }else {
			  model.put("shoe", list);
			
		  }
		  System.out.println(model);
		  ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("ShoeHome");
		  return modelAndView;
		  
	  }
	  @GetMapping("/Shoelist")
	  public ModelAndView list(ModelMap model){
		  List<shoe> list=ss.findAll();
		 
		  if(list.isEmpty()) {
			  model.put("shoe", "NULL");
			 
		  }else {
			  model.put("shoe", list);
			
		  }
		  System.out.println(model);
		  ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("ViewProducts");
		  return modelAndView;
		  
	  }
	  @Autowired
	  private orderService os;
	  
	  @GetMapping("/OrderList")
	  
	  public List<order> olist(){
		  List<order> list=os.findAll();
		  if(list.isEmpty()) {
			  return  list=null;
		  }else {
			  return list;
		  }
		
		  
	  }
	  @PostMapping("/addOrder/{id}")
	  public String AddOrder(@RequestBody order o,String id) {
		  //String uid= request.getSession().getAttribute("email").toString();
		 // o.setUid(uid);
		  o.setId(id);
		  String result=os.SaveOrder(o);
		return result;
		 
	  }
	  

}
