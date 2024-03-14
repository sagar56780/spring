package run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.College;
import pojo_classes.Student;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Student stu=(Student) ac.getBean("student");
		
		List<College> cl=stu.getColleges();
		System.out.println(cl);
		}
	
	}
