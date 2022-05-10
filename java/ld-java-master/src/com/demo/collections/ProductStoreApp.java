package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ProductStoreApp {
	Map<Integer, Product> productsMap = new HashMap<Integer, Product>();

	public static void main(String[] args) {
		ProductStoreApp productStoreApp = new ProductStoreApp();
		productStoreApp.menu();
	}

	private void menu() {

		Scanner scanner = new Scanner(System.in);

		String option = "y";

		while (option.equals("y")) {
			System.err.println("Product App");
			System.err.println("0. List");
			System.err.println("1. Add");
			System.err.println("2. Update");
			System.err.println("4. Delete");
			System.err.println("5. Search");
			System.err.print("Enter choice : ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 0:
				listProducts();
				break;
			case 1:
				addProduct();
				break;
			case 5:
				searchProductById();
			default:
				System.err.println("Enter valid choice");
				break;
			}
			System.err.print("continue y/n ? : ");
			option = scanner.nextLine();
		}
	}

	private void searchProductById() {
		System.err.println("Enter Id : ");
		Scanner scanner = new Scanner(System.in);
		int productId = Integer.parseInt(scanner.nextLine());
		// iterate through map
		boolean found = false;
		for (Entry<Integer, Product> productEntry : productsMap.entrySet()) {
			Integer productIdToCompare = productEntry.getKey();
			if(productId == productIdToCompare)
			{
			Product product = productEntry.getValue();
//			System.err.println(productId);
			System.err.println(product);
			found = true;
			break;
			}
		}
		if(!found)
			System.err.println("Product not found!");
	}

	private void searchByProductName() {
		System.err.println("Enter Id : ");
		Scanner scanner = new Scanner(System.in);
		int productId = Integer.parseInt(scanner.nextLine());
		// iterate through map
		boolean found = false;
		for (Entry<Integer, Product> productEntry : productsMap.entrySet()) {
			Integer productIdToCompare = productEntry.getKey();
			if(productId == productIdToCompare)
			{
			Product product = productEntry.getValue();
//			System.err.println(productId);
			System.err.println(product);
			found = true;
			break;
			}
		}
		if(!found)
			System.err.println("Product not found!");
	}
	private void listProducts() {
		// iterate through map
		for (Entry<Integer, Product> productEntry : productsMap.entrySet()) {
			Integer productId = productEntry.getKey();
			Product product = productEntry.getValue();
//			System.err.println(productId);
			System.err.println(product);
		}
	}

	// IP accept from user
	private void addProduct() {
		System.err.println("Enter Product : ");
		Scanner scanner = new Scanner(System.in);
		int productId = Integer.parseInt(scanner.nextLine());
		String productName = scanner.nextLine();
		float price = Float.parseFloat(scanner.nextLine());
		Product product = new Product(productId, productName, price);
		productsMap.put(product.getProductId(), product);
	}
}

class Product extends Object {
	private int productId;
	private String productName;
	private float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return productId + " " + productName + " " + price ;
	}

}