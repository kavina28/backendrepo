package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Courier;
import com.example.demo.Repository.CourierRepo;
import com.example.demo.dto.Courierdto;

@Service
public class CourierDet {
	@Autowired
	private CourierRepo courierRepo;

	public String addDetails(Courierdto courierdto) {
		
		Courier courier =new Courier(
				courierdto.getId(),
                courierdto.getName(),
                courierdto.getPackage_location(),
                courierdto.getDelivery_date()
				);
				courierRepo.save(courier);
				return courier.getName();			
	}
	
	public List<Courier> getCourier()
	{
		return courierRepo.findAll();
	}
	public String updateCourier(Courier courier) {
		courierRepo.save(courier);
		return "updated";
	}

	public String deleteById(int id) {
		courierRepo.deleteById(id);
		return"Deleted";
	}
	
}
