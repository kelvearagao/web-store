package com.packt.webstore.repository;

import java.util.List;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	
	List<Product> getAllProducts();
	Product getProductById(String productId);
	
}
