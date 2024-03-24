package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp")
public class Employee {
	@Value(value="101")
	int id;
	@Value(value="shubham")
	String name;
	@Value(value="24000")
	double salary;
	public void display()
	{
		System.out.println(this.name+"\n"+this.salary+"\n");
	}
	

}
