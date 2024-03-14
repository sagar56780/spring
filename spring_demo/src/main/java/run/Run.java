package run;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pojo_classes.FirstPojo;

public class Run {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		FirstPojo pojo1=(FirstPojo) ac.getBean("first_pojo");
		pojo1.massage();
	}

}

