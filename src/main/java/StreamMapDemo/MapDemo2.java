package StreamMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	public static void main(String args[]){
		List<String> vehicleNames= Arrays.asList("Activa", "jupiter" , "aCCess" ,"vesPa" , "MAESTRO");
		List<String> uppercase= new ArrayList<>();
		
		// Find the length of the names and print all the vehicle names lenght
		//Without streams
		for(String s: vehicleNames){
			System.out.println(s.length());
		}
		System.out.println("************************");
		// With Streams and Maps
		vehicleNames.stream().map(str -> str.length()).forEach(System.out:: println);
	}
}
