package Shopping_application;

import java.util.List;
import java.util.ArrayList;

public class Store {
	private List<Product> productList;

	public Store() {
		this.productList = new ArrayList<>();
		productList.add(new Product("P101", "Laptop", 749.99));
        productList.add(new Product("P102", "Headphones", 49.99));
        productList.add(new Product("P103", "Smartphone", 599.00));
        productList.add(new Product("P104", "Keyboard", 25.00));
	}
	
	public void viewProducts() {
		
		if (productList.isEmpty()) {
            System.out.println("No products available in the store.");
            return;
        }
		
		System.out.println("Product ID | Prod. Name | Prod. Price");
		for (Product p : this.productList) {
			System.out.println(p);
		}
	}
	
	public Product findProductById(String productId) {
		for (Product p : this.productList) {
			if (p.getProductId().equalsIgnoreCase(productId)) {
				System.out.println("Product Available");
				return p;
			}
		}
		return null;
	}
	
}
