package pojo_classes;

public class Database {
	public  Database()
	{
		System.out.println("this is database constructor");
		
	}
	public void postConstructor() {
		System.out.println("connection object is created");
		
	}
	public void preDestroy() {
		System.out.println("connection object is closed");
	}

}
