package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Employee;
import com.example.beans.Product;
import com.example.service.EmployeeService;
import com.example.service.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	
	
	@Autowired
	ProductService productService;
 
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
		
	@PostMapping("/createProduct")
	public void createProduct(@RequestBody Product product) {
		productService.saveProduct(product);
	}
	
	@GetMapping(value = "/getProduct/{id}")
	public Product getEmployeeById(@PathVariable("id") Integer id) {
		return productService.findProduct(id);
	} 

	@DeleteMapping(value = "/deleteProduct/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		System.out.println("Id from user" + id);
		productService.deleteProduct(id);
	} 
	
	@PutMapping(value = "/updateProduct")
	public void updateEmployeeById(@RequestBody Product product) {
		productService.updateProduct(product);
	}


}
