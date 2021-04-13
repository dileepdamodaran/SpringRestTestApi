package com.ddn.service;
/**
 * Functional interfaces are those interfaces that have only one abstract method in it 
 * it can have more than one default or static method and can override the method 
 * from java.lang.object
 * @author dileepdamodaran
 *
 */
@FunctionalInterface
public interface FunctionalInterfaceTest {

	void testMethod();

	default void testDefaultMethod() {

	}

	default void testDefaultMethod1() {

	}
	
	
}
