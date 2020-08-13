package martinez9;

public class Gift {

	private String recipient;
	private String description;
	private double price;
	private int qty;
	public static int recipients = 0;
	
	
	public Gift(String recipient, String description, double price, int qty) {
		super();
		this.recipient = recipient;
		this.description = description;
		this.price = price;
		this.qty = qty;
		recipients++;
		
	}



	public String getRecipient() {
		return recipient;
	}



	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQty() {
		return qty;
	}
		public void giftsVal() {
	      System.out.println("\nSpent on " + getRecipient() + " $" + String.format("%.2f", (getPrice()* getQty())));
		}

		@Override
		public String toString() {
			return recipient + ", " + "gift " + description + ", $"  + price + ", " + "quantity " + qty;
		}
	
}
