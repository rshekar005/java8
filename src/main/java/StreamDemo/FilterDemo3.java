package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
	public static void main(String args[]){
		// Remove null values from list
		List<String> words= Arrays.asList("cup", null, "Tea" , "cofee" , "Boast" , null , "Horlicks", null);
		
		List<String> result = new ArrayList<String>();
		result=words.stream().filter(str-> str!=null).collect(Collectors.toList());
		System.out.println(result);
	}
}
