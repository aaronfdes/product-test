package com.shopping.product.service;

import java.util.List;

import com.shopping.pojo.product.Product;

/**
 * Interface for all Product related services
 * 
 * @author aaron on 16-Mar-2016
 */
public interface ProductService {

	/**
	 * Method to add a product
	 * 
	 * @param product
	 */
	void addProduct(Product product);

	/**
	 * Method to get a single product based on the passed product id
	 * 
	 * @param id
	 * @return Product
	 */
	Product getProduct(Long id);

	/**
	 * Method to return all products
	 * 
	 * @return List &lt;Product&gt;
	 */
	List<Product> getAllProducts();
}
