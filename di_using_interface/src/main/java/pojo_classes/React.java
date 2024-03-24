package pojo_classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("react")
public class React implements FrontEnd{

	@Override
	public void buildfrontEnd() {
		// TODO Auto- method stub
		System.out.println("front end build using react");
	}

}
