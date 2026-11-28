package com.psm.main;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.psm.bean.Product;
import com.psm.dao.DataAccessException;
import com.psm.dao.ProductDao;

public class MainApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws DataAccessException {

		int choice = 0;
		ProductDao proDoa = new ProductDao();

		do {

			try {
				System.out.println("==============================================");
				System.out.println("\tPRODUCT MANAGEMENT SYSTEM");
				System.out.println("==============================================");

				System.out.println("\n1. Add New Product");
				System.out.println("2. View All Products");
				System.out.println("3. Search Product by ID");
				System.out.println("4. Update Product");
				System.out.println("5. Delete Product");
				System.out.println("6. Display Low Stock Products");
				System.out.println("7. Search Product By Category");
				System.out.println("8. Exit\n");

				System.out.println("==============================================");
				System.out.print("Enter Your Choice: ");
				choice = sc.nextInt();

				switch (choice) {

				case 1: {
					// Product price must be greater than zero.
					// Product quantity cannot be negative.
					// Add New Product
					sc.nextLine();
					System.out.print("Enter the Product Name : ");
					String productName = sc.nextLine();
					System.out.print("Enter the Product Category : ");
					String category = sc.nextLine();
					System.out.print("Enter the Product Price : ");
					double price = sc.nextDouble();
					if (price <= 0) {
						throw new InvalidPrice("Invalid Price\n\tPrice Must be Greater than Zero(0).");
					}
					System.out.print("Enter the Product Quantity : ");
					int quantity = sc.nextInt();
					if (quantity < 0) {
						throw new InvalidQuantity("Invalid Quantity\n\tQuantity Cannot be Negative.");
					}
					sc.nextLine();
					System.out.print("Enter name of Product Manufacturer : ");
					String manufacturer = sc.nextLine();

					Product pro = new Product(productName, category, price, quantity, manufacturer);
					try {
						proDoa.insertProduct(pro);
					} catch (DataAccessException e) {
						e.printStackTrace();
					}

				}
					break;

				case 2: {

					// View All Products
					// Display products sorted by price in ascending/descending order.
					int innerChoice;
					List<Product> viewAllProducts;
					try {
						viewAllProducts = proDoa.viewAllProducts();
						if (viewAllProducts.isEmpty()) {
							System.out.println("No products found in the database!!");
							break;
						}
						do {

							System.out.println("---------------------------------------");
							System.out.println("\tVIEW ALL PRODUCTS MENU");
							System.out.println("---------------------------------------\n");

							System.out.println("1. View in Accending Order By Price");
							System.out.println("2. View in Descending Order By Price");
							System.out.println("3. Exit the VIEW ALL PRODUCTS MENU\n");
							System.out.println("---------------------------------------");
							System.out.print("Enter Your Choice : ");
							innerChoice = sc.nextInt();

							switch (innerChoice) {

							case 1: {
								Collections.sort(viewAllProducts, new SortProductsInAccOrd());
								System.out.println("------------ ALL PRODUCTS ------------\n");
								for (Product product : viewAllProducts) {
									System.out.println(product.getProductId() + " " + product.getProductName() + " "
											+ product.getCategory() + " " + product.getPrice() + " "
											+ product.getQuantity() + " " + product.getManufacturer());
								}
							}
								break;

							case 2: {
								Collections.sort(viewAllProducts, new SortProductsInDescOrd());
								System.out.println("------------ ALL PRODUCTS ------------\n");
								for (Product product : viewAllProducts) {
									System.out.println(product.getProductId() + " " + product.getProductName() + " "
											+ product.getCategory() + " " + product.getPrice() + " "
											+ product.getQuantity() + " " + product.getManufacturer());
								}
							}
								break;

							case 3:
								break;

							default:
								System.out.println("Invalid Choice!!");
							}// end of switch

						} while (innerChoice != 3);

					} catch (DataAccessException e) {
						e.printStackTrace();
					}

				}
					break;

				case 3: {

					System.out.print("\nEnter the ID You want to search : ");
					int id = sc.nextInt();

					Product productById;
					try {
						productById = proDoa.searchProductById(id);
						if (productById != null) {
							System.out.println(productById.getProductId() + " " + productById.getProductName() + " "
									+ productById.getCategory() + " " + productById.getPrice() + " "
									+ productById.getQuantity() + " " + productById.getManufacturer());
						} else {
							System.out.println("Product With ID " + id + " NOT Found in the Database!!");
						}
					} catch (DataAccessException e) {
						e.printStackTrace();
					}

				}
					break;

				case 4: {

					// Update Product
					// Before updating a product, check whether it exists.

					System.out.print("\nEnter the ID You want to Update : ");
					int id = sc.nextInt();

					boolean idExist;
					try {
						idExist = proDoa.doesIdExist(id);
						if (idExist) {
							sc.nextLine();
							System.out.print("Enter the New Product Name : ");
							String productName = sc.nextLine();
							System.out.print("Enter the New Product Category : ");
							String category = sc.nextLine();
							System.out.print("Enter the New Product Price : ");
							double price = sc.nextDouble();
							if (price <= 0) {
								throw new InvalidPrice("Invalid Price\n\tPrice Must be Greater than Zero(0).");
							}
							System.out.print("Enter the New Product Quantity : ");
							int quantity = sc.nextInt();
							if (quantity < 0) {
								throw new InvalidQuantity("Invalid Quantity\n\tQuantity Cannot be Negative.");
							}
							sc.nextLine();
							System.out.print("Enter name of New Product Manufacturer : ");
							String manufacturer = sc.nextLine();
							Product pro = new Product(productName, category, price, quantity, manufacturer);
							proDoa.updateProduct(id, pro);
						} else {
							System.out.println("Id Does not exist!!");
						}

					} catch (DataAccessException e) {
						e.printStackTrace();
					}

				}
					break;

				case 5: {

					// Delete Product
					// Before deleting a product, verify its existence.

					System.out.print("\nEnter the ID You want to Delete : ");
					int id = sc.nextInt();
					try {
						if (proDoa.deleteProduct(id)) {
							System.out.println("Product " + id + " deleted successfully.");
						} else {
							System.out.println("Product " + id + " does not exist.");
						}
					} catch (DataAccessException e) {
						e.printStackTrace();
					}

				}
					break;

				case 6: {

					// Display Low Stock Products

					System.out.print("Enter the Threshold You want : ");
					int threshold = sc.nextInt();

					List<Product> lowStockProduct;
					try {
						lowStockProduct = proDoa.findLowStock(threshold);
						if (!lowStockProduct.isEmpty()) {

							for (Product product : lowStockProduct) {
								System.out.println(product.getProductId() + " " + product.getProductName() + " "
										+ product.getCategory() + " " + product.getPrice() + " " + product.getQuantity()
										+ " " + product.getManufacturer());
							}

						} else {
							System.out.println("The Database Don't have any low Stock Products");
						}
					} catch (DataAccessException e) {
						e.printStackTrace();
					}

				}
					break;

				case 7: {

					// Search Product By Category
					sc.nextLine();
					System.out.print("\nEnter the Category You want to search : ");
					String category = sc.nextLine();

					List<Product> productByCategory;
					try {
						productByCategory = proDoa.searchProductByCategory(category);

						if (!productByCategory.isEmpty()) {

							for (Product productByCate : productByCategory) {
								System.out.println(productByCate.getProductId() + " " + productByCate.getProductName()
										+ " " + productByCate.getCategory() + " " + productByCate.getPrice() + " "
										+ productByCate.getQuantity() + " " + productByCate.getManufacturer());
							}

						} else {
							System.out.println("Product With Category " + category + " NOT Found in the Database!!");
						}

					} catch (DataAccessException e) {
						e.printStackTrace();
					}

				}
					break;

				case 8: {
					// Exit
					System.out.println("Exiting the Product Management Application...");
					break;
				}

				default:
					System.out.println("Invalid Choice!!!");

				}

			} catch (InvalidPrice | InvalidQuantity e) {
				System.out.println("Error: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid number.");
				sc.nextLine();
				choice = 0;
			}

		} while (choice != 8);

	}

}
