package com.shopping.product.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopping.arch.annotations.ShoppingFacade;
import com.shopping.pojo.product.Product;
import com.shopping.product.facade.ProductFacade;
import com.shopping.product.service.ProductService;

/**
 * Implementation class for ProductFacade
 * 
 * @author aaron on 17-Mar-2016
 */
@ShoppingFacade
public class ProductFacadeImpl implements ProductFacade {

	@Autowired
	private ProductService productService;

	@Override
	public void addProduct(Product product) {
		productService.addProduct(product);
	}

	@Override
	public Product getProduct(Long id) {
		return productService.getProduct(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

}
