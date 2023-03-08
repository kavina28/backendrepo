package com.example.demo.Service;

import java.util.List;

import com.example.demo.Models.Courier;
import com.example.demo.dto.Courierdto;

public interface CourierService {
	String addDetails(Courierdto courierdto);

	List<Courier> getCourier();

	String updateCourier(Courier courier);
	
	String deleteById(int id);

	
}
