package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Employee;
import com.example.beans.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer> {
	
		
}
