package pojo_classes;

public class Item {
	public String name;
	public Double price;
	public Item(String name,Double price)
	{
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

	
}
