package com.shopping.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.pojo.product.Product;

/**
 * Spring JPA product repositorry 
 * @author aaron on 17-Mar-2016
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
