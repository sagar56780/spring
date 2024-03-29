package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Staff;
import pojo_classes.Student;
import pojo_classes.Teacher;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student) ac.getBean("student");
		Teacher teacher=(Teacher) ac.getBean("teacher");
		Staff staff=(Staff) ac.getBean("staff");
		
		student.study();
		teacher.teaching();
		staff.work();
		
	}

}
