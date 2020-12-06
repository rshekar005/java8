package com.java8.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String args[]){
		List<Integer> list= Arrays.asList(1,1,1,2,3,4,5,5,6,7);
		list.stream().filter(i-> i>1).forEach(System.out::println);
		
		List<Integer> list1= Arrays.asList(6,4,5,4);
	}

}
