/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// TODO: Declare as an aspect
@Aspect
public class CatalogAspect {

	// TODO: Uncomment the below, and finish to declare the below as a pointcut expression
	@Pointcut("execution(* com.javatunes.service.Catalog.f*(..))")
	// TODO: Finish so the pointcut name is anyCatalogMethod
	public void anyCatalogMethod() {} // No body in this method

	// TODO: Add before advice associated with anyCatalogMethod pointcut
	@Before("anyCatalogMethod()")
	public void dbPing() {
		System.out.println("Pinging database ...");
	}

}