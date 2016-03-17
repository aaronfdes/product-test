package com.shopping.pojo.product;

import java.math.BigDecimal;

import javax.persistence.Entity;

import com.shopping.pojo.common.BasePojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The Product class 
 * @author aaron on 16-Mar-2016
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BasePojo {

	private String name;
	private String description;
	private BigDecimal price;
	
}
