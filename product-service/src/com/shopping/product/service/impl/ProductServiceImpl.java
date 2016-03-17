package com.shopping.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopping.arch.annotations.ShoppingService;
import com.shopping.pojo.product.Product;
import com.shopping.product.service.ProductService;
import com.shopping.repository.product.ProductRepository;

/**
 * Implementation class for ProductService
 * @author aaron on 17-Mar-2016
 */
@ShoppingService
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findOne(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

}
