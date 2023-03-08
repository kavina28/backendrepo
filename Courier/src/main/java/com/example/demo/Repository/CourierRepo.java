package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Courier;
@Repository
public interface CourierRepo extends JpaRepository <Courier,Integer> {

}
