package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {

		List<Integer> numberList= Arrays.asList(2,3,4,5,6,7,8,9,10);
		
		//count
		long count=numberList.stream().filter(num -> num %2==0).count();
		System.out.println("Number of even numbers "+count);
		
		//min() -> Non Terminal operator
		// min and max() internally uses comparable and comparator. It takes two arguments min(val1,val2) --> comparable
		// return val1.compareTo(val2) --> comparator
		Optional <Integer> minnumber=numberList.stream().min((val1, val2)-> { return val1.compareTo(val2);});
		System.out.println("Minimum number in a list is "+minnumber.get());
		
		//max()
		Optional <Integer> maxnumber=numberList.stream().max((val1, val2)-> { return val1.compareTo(val2);});
		System.out.println("Maximum number in a list is "+maxnumber.get());
		
		
	}

}
