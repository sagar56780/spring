package pojo_classes;

import org.springframework.stereotype.Component;

@Component("react")
public class React  implements FrontEnd {

	@Override
	public void buildFrontEnd() {
		// TODO Auto-generated method stub
		System.out.println("front end build by react");
		
	}
	
	

}
