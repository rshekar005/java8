package com.anonymous;

/**
 * 
 * @author rajasekhar
 * In Interface we cannot create a method body. 
 * But in Java 8 we can with the help of default and static keywords for method
 * If We are using lambda expression for below method in any class then we cannot create any method in interface.
 * This concept is called SAM --> Single abstract method.
 * Below interface is called Functional INterface.
 * If you found any interface as FunctionalINterface means we cannot write any abstract method.
 * 
 * In below interface written t1() method 
 * 
 * https://beginnersbook.com/2017/10/java-lambda-expressions-tutorial-with-examples/
 * 
 *  Functional Interface is special interface having only one abstract method in it. All are available in java.util.function package.
It can be written with @FunctionalInterface annotation also.

default and static are not abstract methods because it contains method declaration.
 */
@FunctionalInterface
public interface WebPage {
	
	
	public void header(String value); //one abstract method
    //void t1();  //abstract method
	
	default void test()
	{
		
	}
	
	static void test2()
	{
		
	}
}
