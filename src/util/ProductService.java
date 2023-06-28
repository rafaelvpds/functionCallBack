package util;

import java.util.List;

import entities.Product;

public class ProductService {

	public double filterSum(List<Product> list) {
		double sum = 0;

		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum = sum + p.getPrice();
			}

		}

		return sum;

	}
}
