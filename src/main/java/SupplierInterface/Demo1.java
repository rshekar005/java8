package SupplierInterface;

import java.util.Date;
import java.util.function.Supplier;

/*
 *takes no argument and return a result: 
 * Instead it input it returns result.
 * From below example -->  Supplier<Date> -> It prints date . it means Supplier<R>. Here R is result
 * get() -> Single abstract methods
 * 
 * With Suppliers we can do assertions in JUnit
 */
public class Demo1 {
	//Here return type is Date. So it returns data
 public static void main(String args[]){
	 Supplier<Date> s=()-> new Date();
	 System.out.println(s.get());
 }
}
