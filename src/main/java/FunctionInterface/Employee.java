package FunctionInterface;

public class Employee {
	private String ename;
	private int esalary;
	
	public Employee(String name, int sal) {
		this.ename=name;
		this.esalary=sal;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	

}
