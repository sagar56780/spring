package pojo_classes;

import org.springframework.stereotype.Component;

@Component("angular")
public class Angular implements FrontEnd {

	@Override
	public void buildFrontEnd() {
		// TODO Auto-generated method stub
		System.out.println("front end build by angular");
		
	}
	

}
