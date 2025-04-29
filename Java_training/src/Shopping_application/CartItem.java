package Shopping_application;

public class CartItem {
	private Product product;
	private int quantity;
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalPrice() {
		return Math.round((product.getPrice() * this.quantity) * 100.0 / 100.0);
	}

	@Override
	public String toString() {
		return "product: " + this.product.getName() + ", quantity: " + this.quantity + "\nTotal Price: " + this.totalPrice();
	}
	
}
