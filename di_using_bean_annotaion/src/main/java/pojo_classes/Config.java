package pojo_classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "pojo_classes")
public class Config {
	@Bean("angular")
	public Angular getAngular()
	{
		return new Angular();
	}
	@Bean("react")
	public React getReact()
	{
		return new React();
	}

}
