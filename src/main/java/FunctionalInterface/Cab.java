package FunctionalInterface;

@FunctionalInterface
public interface Cab {
	
	//public void bookCab();
	//public void cancelCab(); // It will throw compile time error for interface
	
	public void bookCab(String source, String destination);
	default void test(){
		
	}
	static void test2(){
		
	}
}