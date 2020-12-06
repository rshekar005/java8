package StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) {
		
		//1. sorted() 
		List<Integer> list1= Arrays.asList(1,3,5,7,9,1,2,4,6);
		// It will sort from ascending order
		list1.stream().sorted().forEach(System.out::println);
		// sorting with descending order. Then we need to use comparator
		System.out.println("******************");
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		List<String> list2 = Arrays.asList("John", "Flower", "Bira", "Calsburg");
		list2.stream().sorted().forEach(System.out::println); // ascending order based on first character of the string
		System.out.println("****************Descending Order**************");
		list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("*******************************************");
		// 2. anyMatch() --> returns boolean value true if it matches with the collection object
		Set<String> fruits= new HashSet<String>();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("Anjeer");
		fruits.add("Grapes");
		
		//If using return statement then we need to use curly braces and ends with ;(semi colon)
		boolean b=fruits.stream().anyMatch(value -> { return value.startsWith("A");}); // It returns false becuase there is no fruit with the letter C
		System.out.println(b);
		System.out.println("*******************************************");
		// 3. allMatch() --> returns boolean value if all the objects matches
		boolean b1=fruits.stream().allMatch(value -> { return value.startsWith("A");});
		System.out.println(b1);
		System.out.println("*******************************************");
		// 4. nonMatch() --> Opposite of allMatch()
		boolean b2=fruits.stream().noneMatch(value -> { return value.startsWith("d");});
		System.out.println(b2);
		
		System.out.println("*******************************************");

		// 3. findAny() --> finds any element from the stream
		List<String> list3= Arrays.asList("one","two","three","four","five");
		Optional<String> element=list3.stream().findAny();
		System.out.println(element.get());

		System.out.println("*******************************************");

		// 4. findFirst() --> It returns first element from stream
		List<String> list4= Arrays.asList("one","two","three","four","five");
		Optional<String> element1=list4.stream().findFirst();
		System.out.println(element1.get());
		
		// 5. concatenating streams --> It adds two or more streams (which contains collection)
		List<String> animals = Arrays.asList("Dog", "Cat" , "Elephant");
		List<String> birds= Arrays.asList("peacock ", "Parrot" ,"Crow" );
		
		Stream<String> stream1= animals.stream();
		Stream<String> stream2= birds.stream();
		
		List<String> listofanimals=Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(listofanimals);
		
	}

}
