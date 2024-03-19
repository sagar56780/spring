package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Amazon;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Amazon az=(Amazon) ac.getBean("amazon");
		System.out.println(az.cart);
	}
			

}
