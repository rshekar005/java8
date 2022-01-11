package FunctionInterface;

import java.util.function.Function;

/*
 * Chaining concept
 * 
 *  1. Using andThen()
 *  2. Using compose()
 */
public class Demo3 {
	public static void main(String args[]){
		
		Function<Integer, Integer> f1= n-> n*10;
		Function<Integer, Integer> f2= n-> n*n*n;
		
		/* It will execute like below first it will run 2*10 = 10. Then 10 will pass to f2 -> 20*20*20 */
		System.out.println(f1.andThen(f2).apply(2));
		
		/* It will execute like below first it will run 2*2*2 = 8. Then 8 will pass to f1 -> 8*10. Reverse of andThen() */
		System.out.println(f1.compose(f2).apply(2));
		
	}

}
