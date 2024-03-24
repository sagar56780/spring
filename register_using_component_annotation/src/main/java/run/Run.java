package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Person;
import pojo_classes.Student;

public class Run {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	Person p=(Person) ac.getBean("person");
	Student s=(Student) ac.getBean("student");
	System.out.println(p+" "+s);
}
}
