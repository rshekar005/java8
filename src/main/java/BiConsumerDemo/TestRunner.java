package BiConsumerDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class TestRunner {

	// BiConsumer accepts input two parameters and returns nothing. 
	//But in consumer interface it accepts one parameter and returns nothing.
	// Bi consumer will work for key , value pairs like properties, Map concepts
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("src/main/java/BiConsumerDemo/config.properties");
		prop.load(fis);
		for(Entry<Object,Object> entry: prop.entrySet()) {
			System.out.println(entry.getKey() + "  : " + entry.getValue());
		}
		
		System.out.println("===============    Using Bi consumer ====================");
		prop.forEach((k,v) ->System.out.println(k + " " +v));
		
		System.out.println("================ Or ==================");
		prop.entrySet().forEach(e -> System.out.println(e.getKey() + " " +e.getValue()));
	}

}
