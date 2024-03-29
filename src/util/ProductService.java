package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filterSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0;

		for (Product p : list) {
			if (criteria.test(p)) {
				sum = sum + p.getPrice();
			}

		}

		return sum;

	}
}
