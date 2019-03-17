package com.xworkz.web.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.xworkz.web.controller.TharakariController;

public class TharakariDTO implements Serializable{

	private String name;
	private int quantity;
	private Double price;
	private String type;
	@DateTimeFormat(pattern=TharakariController.date_format)
	private Date deliveryDate;
	
	
	public TharakariDTO() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	@Override
	public String toString() {
		return "TharakariDTO [name=" + name + ", quantity=" + quantity + ", price=" + price + ", type=" + type
				+ ", deliveryDate=" + deliveryDate + "]";
	}
	

}
