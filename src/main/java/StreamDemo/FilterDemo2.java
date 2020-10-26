package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	public static void main(String args[]){
		List<String> nameList= Arrays.asList("Naveen", "Pavan", "Mukesh" , "Raghav");
		List<String> longnames	=  new ArrayList<String>();
		
		// 1st way using collectmethod which will return list type
		longnames=nameList.stream().filter(str-> str.length()>4 && str.length()<6).collect(Collectors.toList());
		System.out.println(longnames);
		
		//2nd way using foreach
		nameList.stream().filter(str -> str.length()>4 && str.length()<6).forEach(str -> System.out.println(str));
	           //or
		nameList.stream().filter(str -> str.length()>4 && str.length()<6).forEach(System.out::println);
			
	}

}
