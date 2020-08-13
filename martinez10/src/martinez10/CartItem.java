package martinez10;

public class CartItem {

	
	private String item;
	private double price;
	private int quantity;
	
	
	public CartItem(String item, double price, int quantity) {
		super();
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double subtotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return "CartItem: " + item + ", price= " + price + ", quantity=" + quantity;
	}
	
	 
}
