package ConsumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> al= new ArrayList<>();
		al.add(new Employee("Raj", 30000, "Male"));
		al.add(new Employee("Manoj", 50000, "Male"));
		
		Function<Employee, Integer> f= e -> (e.getEsalary()* 10)/100;
		
		Predicate<Integer> p = b-> b> 5000;
		
		Consumer<Employee> c = emp  -> {
								System.out.println(emp.getEname());
								System.out.println(emp.getEsalary());
								System.out.println(emp.getGender());
		};
		
		for(Employee e: al){
			int bonus=f.apply(e);
			if(p.test(bonus)){
				c.accept(e);
				System.out.println(bonus);
			}
		}
		
	}	
 
}
