package com.demo.collections.app;

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
		initProductsMap();
		Scanner scanner = new Scanner(System.in);

		String option = "y";

		while (option.equals("y")) {
			System.err.println("Product App");
			System.err.println("0. List");
			System.err.println("1. Add");
			System.err.println("2. Update");
			System.err.println("4. Delete");
			System.err.println("5. Search By Product Id");
			System.err.println("6. Search By Product Name");
			System.err.print("Enter choice : ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 0:
				listProducts();
				break;
			case 1:
				addProduct();
				break;
			case 2:
				updateProduct();
				break;
			case 5:
				searchByProductId();
			case 6:
				searchByProductName();
			default:
				System.err.println("Enter valid choice");
				break;
			}
			System.err.print("continue y/n ? : ");
			option = scanner.nextLine();
		}
	}

	private void updateProduct() {
		System.err.println("Enter Product Id: ");
		// search for product
		// update code
		Scanner scanner = new Scanner(System.in);
		int productId = Integer.parseInt(scanner.nextLine());
		String productName = scanner.nextLine();
		float price = Float.parseFloat(scanner.nextLine());
		Product product = new Product(productId, productName, price);
		productsMap.put(product.getProductId(), product);
		// product does not exist
	}

	private void initProductsMap() {
		productsMap.put(1, new Product(1, "Pen", 55.5f));
		productsMap.put(2, new Product(2, "Paper", 555.5f));
	}

	private void searchByProductName() {
		System.err.println("Enter Product Name : ");
		Scanner scanner = new Scanner(System.in);
		String productName = scanner.nextLine();
		// iterate through map
		boolean found = false;
		for (Entry<Integer, Product> productEntry : productsMap.entrySet()) {
			//get product
			Product product = productEntry.getValue();
			if(productName.equals(product.getProductName()))
			{	
//			System.err.println(productId);
			System.err.println(product);
			found = true;
			break;
			}
		}
		if(!found)
			System.err.println("Product not found!");
	}

	private void searchByProductId() {
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

