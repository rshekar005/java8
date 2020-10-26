package ConsumerInterface;

public class Employee {
	private String ename;
	private int esalary;
	private String gender;
	
	public Employee(String name, int sal,String gender) {
		this.ename=name;
		this.esalary=sal;
		this.gender=gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
