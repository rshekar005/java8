package com.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8 
{
	public static void main(String args[])
	{
		List<Integer> al =  Arrays.asList(1,2,3,4,5);
		
	/*	//Using for loop
		for(int i=0;i<5;i++)
		{
			System.out.println(al.get(i));
		}
		
		//Using cursors
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Using for  external for each
		for(int i:al)
		{
			System.out.println(i);
		}
		*/
		
		//Internal reference -- 1st way it internally uses 2nd way which declared as below
		al.forEach(i -> System.out.println(i));
		
		System.out.println("**************************");
		//here consumer is a function in Java 8 which uses Consumer inner class which has unimplemented method accept()
		//2nd way
		Consumer<Integer> consume= new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				System.out.println(i);	
			}
		};
		al.forEach(consume);
	}

}
