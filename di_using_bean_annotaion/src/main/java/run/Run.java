package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pojo_classes.BackEnd;
import pojo_classes.Config;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		BackEnd be=(BackEnd) ac.getBean("backend");
		be.front.buildFrontEnd();
	}

}
