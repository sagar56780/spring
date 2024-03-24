package pojo_classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		Person p= (Person) ac.getBean("person");
		Person p1=(Person) ac.getBean("person");
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		Student s1=(Student) ac.getBean("student");
		Student s2=(Student) ac.getBean("student");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}	

}
