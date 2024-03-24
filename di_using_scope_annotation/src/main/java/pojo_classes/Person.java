package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component("person")
public class Person {
	@Value("virat")
	String name;
}
