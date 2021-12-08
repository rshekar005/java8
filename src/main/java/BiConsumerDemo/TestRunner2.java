package BiConsumerDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestRunner2 {

	public static void main(String[] args) {
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "Naveen Automation labs");
		map.put(2, "Rahul shetty");
		map.put(3, "SDET Pavan");
		map.put(4, "Mukesh Otwani");
		map.put(5, "Testing mini bytes");
		map.put(6, "Re-taget common");
		
		// 1st approach
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}
		
		System.out.println("=========================================");
		// Fetching data based on key
		for(Integer inti: map.keySet()) {
			System.out.println(inti + "   "+map.get(inti));
		}
		
		System.out.println("============= Using Java 8==============");
		//Java 8
		map.forEach((a,b) -> System.out.println(a + " : " +b));
		
		map.keySet().forEach(k -> System.out.println(k + " : " +map.get(k)));

	}

}
