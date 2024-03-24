package run;

import pojo_classes.Child;
import pojo_classes.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pojo_classes.Father;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		Father father=(Father) ac.getBean("father");
		Child child=(Child) ac.getBean("child");
		
		father.mobile.use();
		
		child.mobile.use();
	}

}
