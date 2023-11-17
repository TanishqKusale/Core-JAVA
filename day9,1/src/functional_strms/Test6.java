package functional_strms;

import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

/*
 * 2  Prompt user for category n discount. (from product map)
Apply that discount on all products of specified category
 n print those product details after applying the discount
i/p : category n discount
 */
public class Test6 {

	public static void main(String[] args) {
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		System.out.println("shop : ");
		productMap.forEach((k, v) -> System.out.println(v));
		Category cat = Category.BREAD;
		double discount = 10;
		System.out.println("--------------------");
		productMap.values() // Collection<Product>
				.stream() // Stream<Product>
				.filter(p -> p.getProductCategory() == cat)// filtered strm of Products
				.forEach(p -> {
					p.setPrice(p.getPrice() - discount);
					System.out.println(p);
				});
		System.out.println("-------------------");
		// OR
		productMap.values() // Collection<Product>
				.stream() // Stream<Product>
				.filter(p -> p.getProductCategory() == cat)// filtered strm of Products
				.peek(p -> p.setPrice(p.getPrice() - discount))// Stream<Product> : after applying the discount
				.forEach(p -> System.out.println(p));

	}

}
