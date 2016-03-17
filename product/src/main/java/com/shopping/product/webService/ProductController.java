package com.shopping.product.webService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.pojo.product.Product;
import com.shopping.product.facade.ProductFacade;

/**
 * REST web service class that will serve all product related API's<br/>
 * Will be accessible under '/product/' mapping
 * 
 * @author aaron 13-Mar-2016
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductFacade productFacade;
	
	@RequestMapping("/test")
	public String test() {
		return "Hello World";
	}
	
	@RequestMapping("/getAll")
	public List<Product> getAllProducts(){
		return productFacade.getAllProducts();
	}
	
}
