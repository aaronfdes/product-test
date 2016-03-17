package com.shopping;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.shopping.pojo.product.Product;
import com.shopping.product.facade.ProductFacade;

/**
 * Entry point Product micro service
 * 
 * @author aaron on 13-Mar-2016
 */
@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Profile("dev")
	@Bean
	public CommandLineRunner loadInitial(ProductFacade productFacade) {
		return (args) -> {
			productFacade.addProduct(new Product("Book", "used for writing", new BigDecimal(50)));
			productFacade.addProduct(new Product("Pen", "used for writing", new BigDecimal(10)));
			productFacade.addProduct(new Product("Bat", "used for playing", new BigDecimal(1800)));
			productFacade.addProduct(new Product("Ball", "used for playing", new BigDecimal(20)));
			productFacade.addProduct(new Product("TV", "used for entertainment", new BigDecimal(10000.50)));
		};
	}
}
