package run;

import org.springframework.cache.interceptor.AbstractCacheInvoker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Database;
import pojo_classes.FrontEnd;
import pojo_classes.Security;

public class Run {
	public static void main(String[] args) {
		ApplicationContext database_ac=new ClassPathXmlApplicationContext("database_config.xml");
		ApplicationContext front_end_ac=new ClassPathXmlApplicationContext("front_end_config.xml");
		ApplicationContext securtiy_ac=new ClassPathXmlApplicationContext("security_config.xml");
		Database db=(Database) database_ac.getBean("database");
		FrontEnd fe=(FrontEnd) front_end_ac.getBean("front_end");
		Security s=(Security) securtiy_ac.getBean("security");
		
		db.message();
		fe.message();
		s.message();
	}

}
