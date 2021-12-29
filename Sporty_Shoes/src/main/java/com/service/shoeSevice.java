package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.shoe;
import com.repo.SoeRepo;

@Service
public class shoeSevice {
	@Autowired
	public SoeRepo sr;

	public String AddShoes(shoe sh) {
		if(sr.save(sh) != null) {
			return "Success";
		}
		else{
			return "Error";
		}
	}

	public String Update(String id, shoe sh) {
		shoe sh1=sr.findById(id).orElse(null);
		sh1.setImg(sh.getImg());
		sh1.setModal(sh.getModal());
		sh1.setName(sh.getName());
		sh1.setCopmanyname(sh.getCopmanyname());
		sh1.setPrice(sh.getPrice());
		if(sr.save(sh1) != null) {
			return "Success";
		}
		return "Error";
	}

	public String Delete(String id) {
		shoe sh1=sr.findById(id).orElse(null);
		sr.delete(sh1);
		return "Success";
	}

	public List<shoe> findAll() {
		
		return (List<shoe>) sr.findAll();
	}


	public shoe FindDataById(String id) {
		// TODO Auto-generated method stub
		return   sr.findById(id).orElse(null);
	}

}
