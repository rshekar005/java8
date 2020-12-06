package FlatMapDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int sid;
	char grade;
	public Student(String name, int sid, char grade) {
		this.name = name;
		this.sid = sid;
		this.grade = grade;
	}	
}
public class Demo3 {
	public static void main(String args[]){
		//Below list contains sttudent collections
		List<Student> studentList1= Arrays.asList(
						new Student("John", 12, 'A'),
						new Student("Mac", 13, 'C'),
						new Student("Stepheny",14,'B'));
		
		List<Student> studentList2= Arrays.asList(
				new Student("Scott", 01, 'A'),
				new Student("Matt", 02, 'B'),
				new Student("TripleH",03,'B'));
		
		List<List<Student>> finalStudentList= Arrays.asList(studentList1,studentList2);
		
		//Before java8
		for(List<Student> list: finalStudentList){
			for(Student names: list){
				System.out.println(names.name);
			}
		}
		System.out.println("*****************************************");
		//Java 8
		List<String> namesList=finalStudentList.stream().flatMap(n->n.stream().map(n2->n2.name)).collect(Collectors.toList());
		System.out.println(namesList);
	}
}
