package Shopping_application;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	private List<CartItem> cartItem;

	public ShoppingCart() {
		this.cartItem = new ArrayList<>();
	}

	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void addItem(Product product, int quantity) {
		for (CartItem item : cartItem) {
            if (item.getProduct().getProductId().equalsIgnoreCase(product.getProductId())) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("Quantity updated in cart.");
                return;
            }
        }
        cartItem.add(new CartItem(product, quantity));
        System.out.println("Product added to cart.");
	}
	
	public void removeItem(String productId) {
		Iterator<CartItem> iterator = cartItem.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getProduct().getProductId().equalsIgnoreCase(productId)) {
                iterator.remove();
                System.out.println("Product removed from cart.");
                return;
            }
        }
        System.out.println("Product not found in cart.");
	}
	
	public void viewCart() {
		
		if (cartItem.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
		
		System.out.println("--Cart🛒--\nProduct | Price | Quantity | Total Price");
		for (CartItem item : this.cartItem) {
			System.out.println(item.getProduct().getName() + "\t  " + item.getProduct().getPrice() + "\t" + item.getQuantity() + "\t  " + item.totalPrice());
		}
		System.out.println("-------------------------------------------");
		double totalSum = 0;
		for (CartItem item : this.cartItem) {
			totalSum += item.totalPrice();
		}
		System.out.println("Pay amount: " + totalSum);
	}
	
	public void checkOut() {
		
		if (cartItem.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
		
		this.viewCart();
		this.cartItem.clear();
		System.out.println("Thank you for shopping! Visit again.");
	}
	
}
