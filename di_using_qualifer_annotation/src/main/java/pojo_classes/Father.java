package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("father")
public class Father  {
	@Autowired
	@Qualifier("lava")
	public Mobile mobile;


}
