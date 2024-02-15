package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Serviceimpl.LaptopServiceimpl;
import com.example.demo.entity.Laptop;


@RestController

public class LaptopController {
	@Autowired
	LaptopServiceimpl laptopService;

	@GetMapping(value="/get")
	public List<Laptop> getDetails() {
		return laptopService.getDetails();
	}

	@GetMapping(value="/getId/{id}")
	public Laptop getDetailsById(@PathVariable("id") Integer id) {
		return laptopService.getDetailsById(id);
	}

	@GetMapping(value="/getbycolor/{color}")
	public Laptop getDetailsByColor(@PathVariable("color") String color) {
		return laptopService.getDetailsByColor(color);
	}

	@PostMapping(value="/post")
	public Laptop postDetails(@RequestBody Laptop laptop) {
		return laptopService.postDetails(laptop);
	}

	@DeleteMapping(value="/delete/{id}")
	public String deleteDetailsById(@PathVariable("id") Integer id) {
		return laptopService.deleteDetailsById(id);
	}

	@PutMapping(value="/put/{id}")
	public String putdetailsById(@PathVariable("id") Integer id ,@RequestBody Laptop laptop) {
		return laptopService.putStudentById(id, laptop);
	}

}
