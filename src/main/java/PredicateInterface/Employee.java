package PredicateInterface;

public class Employee {
	private String ename;
	private int salary;
	private int experience;
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Employee(String name, int s, int e) {
		this.ename=name;
		this.salary=s;
		this.experience=e;
	}
	

}
