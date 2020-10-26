package FunctionInterface;

import java.util.function.Function;

/*
 * FunctionInterface
 *  1. It takes two parameters <T, R> .
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 *  2. it contains apply() -- Single abtract method
 *  3. When should we go for functional interface
 *     If we want to return some value based on type other than boolean then we should go for FunctionInterface 
 */
public class Demo1 {
	public static void main(String args[]){
		Function<Integer, Integer> f= n -> n*n;
		// In above lambda expression, it takes two parameters <Integer, Integer> 
		// First Integer indicates it accepts int values
		// Second Integer indicates return value.
		System.out.println(f.apply(5)); // Here it returns 25 which is integer . To get clarity change the first parameter as String
		System.out.println(f.apply(9));
		System.out.println(f.apply(19));
		//Example 2: To get length of the string. It accepts string as input and  returns int as a result.
		Function<String, Integer> f2= s-> s.length();
		System.out.println(f2.apply("This is Rajashekar learning java 8"));
	}
}
