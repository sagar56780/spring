package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Employee;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee) ac.getBean("emp");
		emp.display();
		
	}

}
