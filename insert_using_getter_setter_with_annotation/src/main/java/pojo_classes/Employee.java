package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp")
public  class Employee {
	
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	@Value(value="103")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value(value="Aniket")
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	@Value(value="60000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println(this.name+" "+this.salary+" "+this.id);
	}


}
