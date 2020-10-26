package FunctionalInterface;

public class Test {
	public static void main(String args[]){
		Cab cab=( source, destination) -> System.out.println("From "+source+ " To " +destination);
		cab.bookCab("Hyd", "Delhi");
		
	}
}
