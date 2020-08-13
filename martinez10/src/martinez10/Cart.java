package martinez10;
import java.util.*;
public class Cart {
	
	
	public static double total = 0;
	private ArrayList<CartItem> cartItems;

	public Cart() {
		super();
		this.cartItems = new ArrayList<>();
	}
	
	public void add(String item, double price, int quantity) {
		cartItems.add(new CartItem(item,price,quantity));
	}
	
	public void showCart() {
		int i = 1;
		double cartTotal = 0;
		for(CartItem c : cartItems) {
			System.out.println(i++ + " " + c);
			cartTotal += c.subtotal();
		}
		System.out.println("Cart total $" + cartTotal);
		System.out.println();
	}
	
	public void removeItem(int number) {
		if (number > cartItems.size()) {
			return;
		}
		cartItems.remove(number - 1);
}
}