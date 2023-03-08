package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Courier;
import com.example.demo.Service.CourierDet;
import com.example.demo.dto.Courierdto;

@CrossOrigin
@RestController
@RequestMapping("/courier")

public class CourierController {
	@Autowired
	CourierDet courierservice;
	
	@PostMapping("/save")
	public String saveSignUp(@RequestBody Courierdto courierdto)
	{
		String id=courierservice.addDetails(courierdto);
		return id;
	}
	@GetMapping("/get")
	public List <Courier> get()
	{
		return courierservice.getCourier();
	}
	@PutMapping("/put")
	public String update(@RequestBody Courier Courier)
	{
		return courierservice.updateCourier(Courier);
	}
	@DeleteMapping("/del")
	public String delete(@RequestParam int id)
	{
		return courierservice.deleteById(id);
	}
	
}
