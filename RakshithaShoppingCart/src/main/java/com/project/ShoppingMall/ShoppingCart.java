package com.project.ShoppingMall;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Shoppingcart")

public class ShoppingCart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	private float price;
	
	
	
	public ShoppingCart() {
		
	}



	public ShoppingCart(int id, String name, String type, float price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}


    
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
