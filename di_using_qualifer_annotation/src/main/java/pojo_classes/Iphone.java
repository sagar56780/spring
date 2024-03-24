package pojo_classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("iphone")
public class Iphone implements Mobile {

	@Override
	public void use() {
		System.out.println("this is iphone mobile");
		
	}

}
