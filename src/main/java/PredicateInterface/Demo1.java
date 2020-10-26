package PredicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
1.Predicate function --> accepts one argument and returns true or false
2. Predicate is a prefined interface in java8 which has test() which returns boolean value
3. When to use predicate function?
	when there is a conditional check there we can use predicate function like if else.
*/
public class Demo1 {
	public static void main(String args[]){
		//Example 1: Check whether integer > 10
		//Here p is reference and i is an argument
		Predicate<Integer> p = i -> (i>10);				
		System.out.println(p.test(20)); // returns true becase 20>10
		System.out.println(p.test(6)); // returns false because 6<10
		
		// Example 2: check whether lenghth of the string >=4 or not
		Predicate<String> p2= s-> s.length()>4;
		System.out.println(p2.test("Rajashekar"));
		System.out.println(p2.test("xyz"));
		
		// Example 3 -- to check length of the string and print when length greater than 4
		List<String> list = Arrays.asList("Shekar", "Raja", "Pavan" , "Naveen" , "Mukesh" , "Raghav", "A", "XYZ");
		for(String name: list){
			if(p2.test(name)){
				System.out.println("Name is "+name);
			}
		}
	}
	
	
	
}	
