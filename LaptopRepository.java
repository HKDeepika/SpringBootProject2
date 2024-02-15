package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Laptop;

@Repository

public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

	Laptop findByColor(String color);



}
