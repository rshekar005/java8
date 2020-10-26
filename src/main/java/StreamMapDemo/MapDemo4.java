package StreamMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo4 {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(
				new Employee("rajashekar", 1, "1000"),
				new Employee("Manoj", 2, "2000"),
				new Employee("chimpi", 3, "4000"),
				new Employee("Auraj", 4, "9000"),
				new Employee("Umesh", 6, "100000")
				);
		emp.stream().filter(i -> i.getEmpid()>=3).map(name -> name.getName()).forEach(System.out:: println);
				
				
				
	}

}
