package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("person")
public class Person {
	@Value(value="101")
	int id;
	@Value(value="rohit")
	String name;
}
