package com.shopping.arch.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Custom Facade annotation<br/>
 * Has transaction management, and exception handling
 * 
 * @author aaron on 17-Mar-2016
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public @interface ShoppingFacade {

}
