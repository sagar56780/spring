package pojo_classes;

public class Person {
	Mobile mobile;
	public void display()
	{
		System.out.println(mobile.name);
		System.out.println(mobile.price);
	}
	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

}
