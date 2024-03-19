package pojo_classes;

import java.util.Map;

public class Amazon {
	public Map<Integer,Item> cart;

	public Amazon(Map<Integer, Item> cart) {
		super();
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Amazon [cart=" + cart + "]";
	}
	

}
