package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Courierdto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String package_location;
	private String delivery_date;
	
	
	
	public Courierdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courierdto(int id, String name, String package_location, String delivery_date) {
		super();
		this.id = id;
		Name = name;
		this.package_location = package_location;
		this.delivery_date = delivery_date;
	}
	@Override
	public String toString() {
		return "Courierdto [id=" + id + ", Name=" + Name + ", package_location=" + package_location + ", delivery_date="
				+ delivery_date + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPackage_location() {
		return package_location;
	}
	public void setPackage_location(String package_location) {
		this.package_location = package_location;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
}
