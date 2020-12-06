package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author rajasekhar
 *	Non Terminal Methods -> filter(), map(), flatMap(), distinct(), limit() etc
 *	Terminal Methods -> collect(), count(), minimum(), maximum(), forEach(), toArray(), reduce() etc
 *
 *	Non terminal methods return stream of objects. On stream of objects we can apply terminal methods.
 *  Before filtering/Stream we can also use  terminal methods
 */
public class Demo1 {

	public static void main(String[] args) {
		
		//Distinct method -> It will return only unique objects
		List<String> vehiclenames= Arrays.asList("bus","car","cycle","bus","car","cycle","car","cycle","bike");
		List<String> uniqu=vehiclenames.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqu);
		
		// Instead of using collect() we can use forEach(). forEach() is nothing but consumer interface it takes one argument and returns nothing
		vehiclenames.stream().distinct().forEach(value->System.out.println(value));
		
		//count
		long count=vehiclenames.stream().distinct().count();
		System.out.println(count);
		
		//limit() --> from above vehiclenames(9) i want to print only 3 objects.
		vehiclenames.stream().limit(3).forEach(System.out::println);
	}

}
