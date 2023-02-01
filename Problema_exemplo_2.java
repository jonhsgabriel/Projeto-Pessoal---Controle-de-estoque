package entitieProduto;

import java.util.Locale;
import java.util.Scanner;
import entitieProduto.Product;

public class Problema_exemplo_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Product p1 , p2, p3;
		
		p1 = new Product();
		p2 = new Product();
		p3 = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		p1.name = sc.nextLine();
		System.out.println("Price: ");
		p1.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		p1.quantity = sc.nextInt();
		
		p1.toString();
		System.out.println("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		p1.AddProducts(add);
		System.out.printf("Updated data: %s, $ %.4f , %d units, Total: $ %.4f%n", p1.name, p1.price, p1.quantity,p1.TotalValueStoc());
		System.out.println("Enter the number of products to be removed in stock: ");
		add = sc.nextInt();
		p1.RemoveProducts(add);
		System.out.printf("Updated data: %s, $ %.4f , %d units, Total: $ %.4f%n", p1.name, p1.price, p1.quantity,p1.TotalValueStoc());
		sc.close();
	}
}
