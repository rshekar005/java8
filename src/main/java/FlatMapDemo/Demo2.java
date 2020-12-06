package FlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> teamA= Arrays.asList("Sachin", "Sehwag", "Dravid");
		List<String> teamB= Arrays.asList("Dhoni", "Kohli", "Rohit");
		List<String> teamC= Arrays.asList("Iyer", "Pant", "Rahul");
		
		List<List<String>> playersInWorldCup= new ArrayList<List<String>>();
		playersInWorldCup.add(teamA);
		playersInWorldCup.add(teamB);
		playersInWorldCup.add(teamC);
		
		//Before Java 8
		for(List<String> team:playersInWorldCup){
			for(String names: team){
				System.out.println(names);
			}
		}
		System.out.println("****************************");
		// In java 8 we use streams with flatmap()
		List<String> finalplayerlist=playersInWorldCup.stream().flatMap(plist-> plist.stream()).collect(Collectors.toList());
		System.out.println(finalplayerlist);
	}

}
