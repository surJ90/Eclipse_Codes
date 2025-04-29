package Shopping_application;

import java.util.Scanner;

public class OnlineShoppingApp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Store store = new Store();
		ShoppingCart sc = new ShoppingCart();
		
		while (true) {
			System.out.println("\n\nWelcome to online Shopping");
			System.out.println("1. View Products\n2. Add Product to cart\n3. Remove from cart");
			System.out.println("4. View cart\n5. Checkout\n6. Exit");
			System.out.println("Enter your choice:");
			int ch = in.nextInt();
			
			switch(ch) {
				case 1: 
					store.viewProducts();
					break;
				case 2:
					System.out.print("Enter Product ID to add: ");
                    String addId = in.next();
                    Product addProduct = store.findProductById(addId);
                    if (addProduct == null) {
                        System.out.println("Product not found.");
                        break;
                    }
                    System.out.print("Enter quantity: ");
                    int quantity = in.nextInt();
                    in.nextLine();
                    if (quantity <= 0) {
                        System.out.println("Invalid quantity.");
                        break;
                    }
                    sc.addItem(addProduct, quantity);
                    break;

				case 3:
					System.out.print("Enter Product ID to remove from cart: ");
                    String removeId = in.next();
                    sc.removeItem(removeId);
                    break;
				case 4:
					sc.viewCart();
					break;
				case 5:
					sc.checkOut();
					break;
				case 6:
					in.close();
					System.exit(0);
					break;
				default: System.out.println("Invalid choice, try again!");
					break;
			}
		}
		
	}

}
