package pojo_classes;

import org.springframework.stereotype.Component;

@Component("lava")
public class Lava implements Mobile {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("this is a lava mobile");
		
	}

}
