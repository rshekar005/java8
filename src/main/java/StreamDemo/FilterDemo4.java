package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo4 {

	public static void main(String[] args) {
		List<Product> product= new ArrayList<>();
		product.add(new Product(1, "TeaCup", 100.00));
		product.add(new Product(2, "NeelkamalChair", 1000.00));
		product.add(new Product(3, "Laptop", 50000.00));
		product.add(new Product(4, "Sanitizer", 3000.00));
		product.add(new Product(5, "Mobile", 15000.00));
		
		// We need to print the product based on the prizes
		product.stream().filter(p -> p.getPrice() >= 3000).forEach(pr -> System.out.println(pr.getName()));
		
	}

}
