package ConsumerInterface;

import java.util.function.Consumer;

/*
 * 1. It takes one argument and returns nothing
 * 2. accept()
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		Consumer<String> c= s -> System.out.println(s);
		c.accept("WELCOME");
	}

}
