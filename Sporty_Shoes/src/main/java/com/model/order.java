package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="orders")
public class order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String id;
	public String uid;
	public String price;
	public String pid;

	 
	public String getId() {
		return id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUid() {
		return uid;
	}
	public String getPrice() {
		return price;
	}
	public String getProduct() {
		return pid;
	}
	public order(String id, String uid, String price, String product) {
		super();
		this.id = id;
		this.uid = uid;
		this.price = price;
		this.pid = product;
	}
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "order [id=" + id + ", uid=" + uid + ", price=" + price + ", product=" + pid + "]";
	}
	
	

}
