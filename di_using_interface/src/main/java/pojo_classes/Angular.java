package pojo_classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("angular")
public class Angular implements FrontEnd {

	@Override
	public void buildfrontEnd() {
		// TODO Auto-generated method stub
		System.out.println("front end is build using angular");
		
	}
	

}
