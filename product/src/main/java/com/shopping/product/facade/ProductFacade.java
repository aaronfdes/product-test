package com.shopping.product.facade;

import java.util.List;

import com.shopping.pojo.product.Product;

/**
 * Aggrergator class for all product services
 * 
 * @author aaron on 17-Mar-2016
 */
public interface ProductFacade {

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
