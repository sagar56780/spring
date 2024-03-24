package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.Config;
import pojo_classes.Person;

public class Run {
public static void main(String[] args) {
	 	ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
	 	Person person=(Person) ac.getBean("person");
	 	System.out.println(person);
	 			
}
}
