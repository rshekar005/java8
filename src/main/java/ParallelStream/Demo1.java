package ParallelStream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author rajasekhar
 *  By default streams will execute sequentially. Inorder to achieve parallelStreams then use parallelStream() instead of stream()
 */

class Student{
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name=name;
		this.score=score;	
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getScore(){
		return this.score;
	}
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		List<Student> al=Arrays.asList(
				new Student("David", 100),
				new Student("Watson", 90),
				new Student("Kohli", 70),
				new Student("Dhoni", 80),
				new Student("Dravid", 60),
				new Student("Maxwell", 20)
				);
		System.out.println("******************Sequential Stream*****************************");
		// filtering score greater than 70 with limit 3  --> Sequential stream
		al.stream().filter(s-> s.getScore()>=70).limit(3).
		    forEach(stu -> System.out.println(stu.getName()+ "  " +stu.getScore()));
		
		System.out.println("******************Parallel Stream*****************************");
		// parallel stream --> Execution is faster
		al.parallelStream().filter(s-> s.getScore()>=70).limit(3).
		    forEach(stu -> System.out.println(stu.getName()+ "  " +stu.getScore()));
		
		//converting sequential stream to parallel stream using parallel method
		System.out.println("******************Parallel Stream on sequential stream *****************************");
		al.stream().parallel().filter(s-> s.getScore()>=70).limit(3).
		    forEach(stu -> System.out.println(stu.getName()+ "  " +stu.getScore()));
		
		
		
				
				
	}

}
