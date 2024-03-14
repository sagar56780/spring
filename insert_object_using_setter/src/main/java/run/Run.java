package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Person;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Person per=(Person) ac.getBean("person");
		per.getMobile().ring();
		per.calling();
				
	}

}
