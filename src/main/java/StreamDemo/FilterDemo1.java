package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Collection: To represent a group of objects as a single entity
 * Streams : To process the data from collections then we use Stream
 * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 * 
 * Package: java.utils.streams
 * 
 * Filters, maps are two mechanisms in stearms which are used to process the data.
 * 
 * Filter: 	filetring the data based on some condition
 */
public class FilterDemo1 {
	
	public static void main(String args[]){
		List<Integer> list=  Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		
		List<Integer> evenNumberList= new ArrayList<>();
		
		//Without Streams -- To check whether number is even or not
		System.out.println("Without Streams");
		for(int i: list){
			if(i%2==0){
				System.out.println(i+ " is even number");
			}
		}
		
		System.out.println("*************************");
		System.out.println("With Streams");
		//Filter with collect method.
		evenNumberList= list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);
		
		//Filter with foreach which returns element one by one
		list.stream().filter(i -> i%2==0).forEach(i-> System.out.println(i));
		//without arguments
		list.stream().filter(i -> i%2==0).forEach(System.out:: println);
		
	}

}
