package SupplierInterface;

import java.util.function.Supplier;

public class Demo2 {
	
	//Here Double is the return type and it returns double value. To return double value it contains get() abstract method.
	//It will not accept any parameters and returns double value.
	private static Supplier<Double> supplier= () -> Math.random();
	private static Supplier<String> stringvalue =() -> "Hello World";
	public static void main(String[] args) {
		System.out.println(supplier.get());
		System.out.println(stringvalue.get());
	}
}
