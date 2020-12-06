package FlatMapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		/* To understand the differences between map() and flatMap()
		 map() it takes single object and performs some operations and returns single object
		 It maintains one to one relationship.
		 It acts like a function interface
		 */
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list1=list.stream().map(n -> n+5).collect(Collectors.toList());
		System.out.println(list1); //[6, 7, 8, 9, 10, 11]
		
		/*
		 * flatmap() maintains one to many relationship.
		 * It takes stream of collection as input and returns stream of objects unlike map()
		 * Below we have three collections and adding into one collection using flatmap and from that single collection it will perform operations and returns multiple object
		 * Type of collection is list nothing but returns list of integer.
		 * When to use flatmap()
		 *   It is used when we need to perform operation on complex collections
		 */
		List<Integer> list2 = Arrays.asList(1,2);
		List<Integer> list3 = Arrays.asList(3,4);
		List<Integer> list4 = Arrays.asList(5,6);
		
		List<List<Integer>> finallist= Arrays.asList(list2,list3,list4);
		
		/*
		 * Steps
		 * 1. We need to add all collections to stream. From below finallist.stream contains collection of lists
		 * 2. Then we need to use flatmap(). It will take each and every object from the stream and returns multiple objects nothing but stream of objects.
		 * 3. flatmap() takes function as a argument. Here argument is nothing but collections
		 * 
		 * From below example.
		 * x-> x.stream contains list1, list2, list3 and added to finalresults.
		 */
		List<Integer> finalresults=finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(finalresults);//[1, 2, 3, 4, 5, 6]
		
		//If we want to perform some operation on stream of collection then we need to use map() for stream of flatmap
		List<Integer> finalresults2=finallist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(finalresults2);//[11, 12, 13, 14, 15, 16]

		
		
		
	}

}
