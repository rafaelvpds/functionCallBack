package apllication;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> listaProdutos = new ArrayList<>();

		listaProdutos.add(new Product("Tv", 900.00));
		listaProdutos.add(new Product("Mouse", 50.00));
		listaProdutos.add(new Product("Tablet", 350.50));
		listaProdutos.add(new Product("HD case", 80.90));

		ProductService p = new ProductService();
		double sum = p.filterSum(listaProdutos);

		System.out.println("Sum: " + String.format("%.2f", sum));
	}

}
