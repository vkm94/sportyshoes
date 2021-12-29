package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="shoe")
public class shoe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String Id;
	public String name;
	public String modal;
	public String copmanyname;
	public String price;
	public String img;

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	public String getCopmanyname() {
		return copmanyname;
	}
	public void setCopmanyname(String copmanyname) {
		this.copmanyname = copmanyname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "shoe [Id=" + Id + ", name=" + name + ", modal=" + modal + ", copmanyname=" + copmanyname + ", price="
				+ price + ", img=" + img + "]";
	}
	public shoe(String id, String name, String modal, String copmanyname, String price, String img) {
		super();
		Id = id;
		this.name = name;
		this.modal = modal;
		this.copmanyname = copmanyname;
		this.price = price;
		this.img = img;
	}
	public shoe() {
		super();
		// TODO Auto-generated constructor stub
	}

}
