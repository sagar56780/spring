package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="person")
public class Person {
//	@Autowired
	public Mobile mobile;
	private Vehicle vehicle;

	public Mobile getMobile() {
		return mobile;
	}
	@Autowired 
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
	@Autowired 
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Person(@Autowired Mobile mobile) {

		this.mobile = mobile;
	}

	
	

}
