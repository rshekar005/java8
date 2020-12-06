package StreamMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * map() will work on collection which is used to process the data.
 * It will work like Function INterface.
 */
public class MapDemo1 {
	public static void main(String rags[]){
		List<String> vehicleNames= Arrays.asList("Activa", "jupiter" , "aCCess" ,"vesPa" , "MAESTRO");
		List<String> uppercase= new ArrayList<>();
		
		// Covert collection objects into uppercase
		//Without streams and maps
		for(String names: vehicleNames){
			uppercase.add(names.toUpperCase());
		}
		System.out.println(uppercase);
		System.out.println("************************");
		
		//With Streams
		List<String> uppercase1= new ArrayList<>();	
	uppercase1=	vehicleNames.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
	System.out.println(uppercase);
	
	}

}
