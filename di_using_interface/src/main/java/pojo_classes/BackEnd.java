package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("backend")
public class BackEnd {
  @Autowired
 public FrontEnd frontend;
	public void useFrontEnd()
	{
		frontend.buildfrontEnd();
		
	}
	

}
