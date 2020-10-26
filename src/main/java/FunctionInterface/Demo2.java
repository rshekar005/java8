package FunctionInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Raja", 10000));
		al.add(new Employee("Narayana", 60000));
		al.add(new Employee("John", 40000));
		al.add(new Employee("Mary", 80000));
		
		// From below it accepts employee object as an input type and returns integer value nothing but bonus based on sal range s
		// Here i am returning some value based on multiple condition.So using {}.
		Function<Employee, Integer> f= e -> {
				int sal = e.getEsalary();
				if(sal>=10000 && sal<=60000){
					return(sal * 50/100);
				}
				else if(sal>=80000){
					return(sal * 10/100);
				}
				return sal;		
		};
		// Here used predicate funtion which takes integer as an argument. Here it is bonus.
		// If bonus is > 5000 then print employee details
		Predicate<Integer> p= b -> b>5000;
		for(Employee e : al){
			int bonus= f.apply(e);
			if(p.test(bonus)){
				System.out.println(e.getEname()+" salary is "+e.getEsalary() + " Bonus is "+f.apply(e));
			}
			
		}
		
	}

}
