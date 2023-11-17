package functional_strms;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.populateProductList;

/*
 * 1.  Display all product names of a particular category , 
 * exceeding specific price. (from product list)
I/P category name & price.
 */
public class Test5 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in))
		{
			//get product list from utils
			List<Product> productList = populateProductList();
			//display shop contents
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter category name & price.");
			Category cat=Category.valueOf(sc.next().toUpperCase());
			double price=sc.nextDouble();
			System.out.println("All product names by category "+cat+" price > "+price);
			productList.stream() //Stream<Product> : all
			.filter(p -> p.getProductCategory()==cat) //filter Stream : as per category
			.filter(p -> p.getPrice()>price) //as per price : Stream<Product>
			.map(p -> p.getName()) //Stream<String>
			.forEach(name -> System.out.println(name));
		}

	}

}
