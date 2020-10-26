package StreamMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		List<Integer> list=  Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<Integer> result = new ArrayList<Integer>();
		
		list.stream().map(i -> i*3).collect(Collectors.toList()).forEach(System.out:: println);
	}

}
