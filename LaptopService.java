package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Laptop;

public interface LaptopService {

	public List<Laptop> getLaptop();

	public Laptop getDetailsById(Integer id);

	public Laptop getDetailsByColor(String color);

	public Laptop postDetails(Laptop laptop);

	public String deleteDetailsById(Integer id);

	public String putStudentById(Integer id, Laptop updatinglaptop);

}
