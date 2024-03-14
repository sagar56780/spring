package pojo_classes;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private long phone;
	public void displaay()
	{
		System.out.println("id : " + id);
		System.out.println("name: "+ name);
		System.out.println("salary: "+salary);
		System.out.println("phone : "+ phone);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

}
