package com.anonymous;

/**
 * 
 * @author rajasekhar
 * Lambda is nothing but method of a body
 * SAM --> Single abstract method
 * Here Webpage is an interface and we are not created any object for interface but we created a innerclass for webpage and overrided webpage method
 */
public class LamdaExpression {

	public static void main(String[] args) {
		
/*		//Here Webpage is an inteface and we are not created any object for inteface but we created a innnerclass for webpage and overrided webpage method
		WebPage webPage= new WebPage() {
			
			@Override// This is overided method of Interface WebPage
			public void header(String value) {
				System.out.println("Hi " +value);
				
			}
		};
		
		WebPage webPage2= new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println("Hello "+value);
				
			}
		};
		webPage.header("Rajashekar");
		webPage2.header("Google");*/

		
		// If we have to use same method multiple times then code gets lenghty and will face maintainance issues.
		//Inorder to overcome above issue using lambda expression
		// -> this arrow denotes lambda expression
		//Here Webpage page holds one String parameter, So used value and method declaration
		
		//Syntax of lambda expression
		//(parameter_list) -> {function_body}
		
		WebPage w3= (value) -> System.out.println(value);
		w3.header("Rajashekar");
		
	}

}
