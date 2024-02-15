package com.example.demo.Serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repo.LaptopRepo;
import com.example.demo.entity.Laptop;

@Service

public class LaptopServiceimpl {

	@Autowired
	LaptopRepo laptopRepo;

	public List<Laptop> getDetails() {
		return laptopRepo.findAll();
	}

	public Laptop getDetailsById(Integer id) {
		return laptopRepo.findById(id).orElse(null);
	}

	public Laptop getDetailsByColor(String color) {
		return laptopRepo.findByColor(color);
	}

	public Laptop postDetails(Laptop laptop) {
		Laptop l=laptopRepo.save(laptop);
		return l;
	}

	public String deleteDetailsById(Integer id) {
		laptopRepo.deleteById(id);
		return "Deleted";
	}

	public String putStudentById(Integer id, Laptop updatinglaptop) {

		Optional<Laptop> existingLaptop=laptopRepo.findById(id);
		if(existingLaptop.isPresent()) {
			Laptop laptop=existingLaptop.get();
			laptop.setName(updatinglaptop.getName());
			laptop.setColor(updatinglaptop.getColor());

			laptopRepo.save(laptop);
			return "Updation success";
		}
		else {
			return "record not found";
		}

	}	

}
