package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.expression.spel.ast.QualifiedIdentifier;
import org.springframework.stereotype.Component;

@Component("child")
public class Child {
	@Autowired
	@Qualifier("iphone")
	public Mobile mobile;
	

	
}
