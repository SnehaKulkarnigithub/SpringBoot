package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExceptionUtil.ProductNotFoundException;
import com.example.beans.Product;
import com.example.dao.ProductDAO;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;

	// to get all employee from database
	public List<Product> getAllProduct() {
		return (List<Product>) productDAO.findAll();
	}

	public void saveProduct(Product product) {
		
		productDAO.save(product);
	}

	public Product findProduct(Integer id) {
		Optional<Product> prd = productDAO.findById(id);
		Product prd1 = null;
		if (prd.isPresent()) {
			prd1 = prd.get();
		} else {
			throw new ProductNotFoundException("Product not found in database ID : " + id);
		}
		return prd.get();
	}

	public void updateProduct(Product product) {
		productDAO.save(product);
	}

	public void deleteProduct(Integer id) {
		productDAO.deleteById(id);
	}


}
