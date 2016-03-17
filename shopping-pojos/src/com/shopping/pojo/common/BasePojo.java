package com.shopping.pojo.common;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

/**
 * Common base class
 * @author aaron on 17-Mar-2016
 */
@Data
@MappedSuperclass
public abstract class BasePojo {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private Date dateCreated;
	private Date dateModified;
}
