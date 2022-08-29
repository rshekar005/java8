package StreamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		//Reduce() --> Individual objects from a list are combined and returns as a single object
		
		List<String> l=Arrays.asList("A","B","1","2","$");
		Optional<String> reducedString=l.stream().reduce((value, combinedValue)-> {return value+combinedValue;});
		System.out.println(reducedString.get());
		
		//toArray() --> Stream of objects are converted into Array
		Object a[] =l.stream().toArray();
		System.out.println(a.length);
		for(Object v: a){
			System.out.println(v);
		}

	}

}
