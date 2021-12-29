package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repo.MyRepo;
import java.util.Optional;

@Service
public class UserService {
	@Autowired
	private MyRepo myrepo;

public String LoginValid(String email,String pass)	{
	String result1 = null;
	List<User> result=myrepo.findAll();
	if(result.toString().contains(email)){
	
		if(result.toString().contains(pass)) {
			 if(result.toString().contains("user")) {
				 result1= "user";
				 
			 }else {
				 result1= "Admin";
			 }
		}
		
	}
else {
	result1= result.toString();
	}
	return result1;
	
}
public boolean saveUser(String name,String email,String password,String city) {
	
	User saved=myrepo.save(new User(name, email, password, city, city ));
	if(saved==null) {
		return false;
	}
	return true;
	
}
 public List<User> loadUser(){
	 List<User> list=(List<User>) myrepo.findAll();
	 
	return list;
	 
 }
 public boolean FindUser(String name) {
	 
	 Optional <User> user= myrepo.findById(name);
	 if(user.isPresent()) {
		 System.out.println(user);
	return true;
	 }
	return false;
 }
  
 
 public boolean DeleteUser(String name) {
	
	 Optional<User> user = myrepo.findById(name);
	 if(user.isPresent()) {
		 myrepo.deleteById(name);
		
		 System.out.println(user);
	return true;
	 }
	return false;
 }
 
 public boolean UpdateUser(String name,String email,String password,String city) {
	 Optional<User> user= myrepo.findById(name);
	 if(user.isPresent()) {
		 myrepo.deleteById(name);
		 myrepo.save(new User( name,email, password,city, city));
		 System.out.println(user);
	return true;
	 }
	return false;
 }
 
 
public boolean saveUser(User user) {
	String name=user.getName();
	String Email=user.getEmail();
	String city=user.getCity();
	String type="User";
	user.setType("user");
	String pass=user.getPassword();
	return myrepo.save(user) != null ;
}
 
}
