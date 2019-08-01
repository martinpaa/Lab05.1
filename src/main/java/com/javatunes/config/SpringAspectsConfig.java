/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright LearningPatterns Inc.
 */
 
package com.javatunes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.javatunes.aspects.CatalogAspect;

// Declare as a Spring configuration class
@Configuration
//TODO: Enable AspectJ support
@EnableAspectJAutoProxy
public class SpringAspectsConfig {

	// TODO: Declare a bean definition for the aspect class
	@Bean
	public CatalogAspect catalogAspect(){
		return new CatalogAspect();
	}

}