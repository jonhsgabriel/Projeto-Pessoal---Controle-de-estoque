package entitieProduto;

import java.io.PrintStream;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueStoc() {
		return price * quantity;
	}
	public void AddProducts(int x){
		quantity += x;
		
	}
	public void RemoveProducts(int x) {
		if(quantity < x) {
			System.out.println("Não é possível retirar itens");
		}else {
			quantity -= x;
		}
	}
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", TotalValueStoc());
	}
}

