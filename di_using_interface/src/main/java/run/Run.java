package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Config;
import pojo_classes.BackEnd;
import pojo_classes.FrontEnd;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		BackEnd backend=(BackEnd)ac.getBean("backend");
			backend.useFrontEnd();
			backend.frontend.buildfrontEnd();
	}

}
