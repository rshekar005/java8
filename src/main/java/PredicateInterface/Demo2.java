package PredicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo2 {
	
	public static void main(String args[]){
		// Here i want to print the employee name if salary > 50k and experience is 3.
		Predicate<Employee> pr= e -> (e.getSalary()>=50000 && e.getExperience()>=3);
		Employee employee = new Employee("Rajashekar", 50000, 3);
		System.out.println(pr.test(employee));
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("John", 40000, 4));
		al.add(new Employee("Steve", 50000, 4));
		al.add(new Employee("Raja", 20000, 4));
		al.add(new Employee("Narayana", 60000, 3));
		
		for(Employee e: al){
			if(pr.test(e)){
				System.out.println("Name of the employee is "+e.getEname());
			}
		}
		
	}
	
}
