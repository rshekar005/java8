package PredicateInterface;

import java.util.function.Predicate;

// Joining predicates -- and, or, negate

public class JoiningPredicates {
	public static void main(String args[]){
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		
		Predicate<Integer> p1= i -> i%2==0;
		Predicate<Integer> p2= i -> i>5;
		
		//And
		for(int n: a){
		/*	if(p1.test(n) && p2.test(n)){
				System.out.println(n);
			}*/
		//	And
			if(p1.and(p2).test(n)){
				System.out.println(n);
			}
		}
		System.out.println("********************");
		//or
		for(int n: a){
			if(p1.or(p2).test(n)){
				System.out.println(n);
			}
		}
		System.out.println("********************");
		//Negate of p1
		for(int n: a){
			if(p1.negate().test(n)){
				System.out.println(n);
			}
		}
	}
}
