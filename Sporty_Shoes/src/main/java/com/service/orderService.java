package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.order;
import com.model.shoe;
import com.repo.OrderRepo;

@Service
public class orderService {
	@Autowired
private OrderRepo or;
	public List<order> findAll() {
		List<order> ol= (List<order>) or.findAll();
		return ol;
	}
	public String SaveOrder(order o) {
		if(or.save(o) != null) {
			return "Success";
		}
		else{
			return "Error";
		}
	}

}
