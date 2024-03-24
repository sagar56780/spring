package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component("backend")
public class BackEnd {
	@Autowired
	@Qualifier("react")
	public FrontEnd front;
	
	
	

}
