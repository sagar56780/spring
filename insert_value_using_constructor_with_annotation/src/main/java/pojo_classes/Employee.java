package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp")
public class Employee {
	int id;
	String name;
	double salary;
	public Employee(@Value(value="101")int id,@Value(value="shubham") String name,@Value(value="40000")double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println(this.name+" "+this.salary+" "+this.id);
	}

}
