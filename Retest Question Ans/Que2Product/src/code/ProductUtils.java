package code;

import java.util.ArrayList;


public class ProductUtils {
	public static ArrayList<Product> populateList(){
ArrayList<Product> al = new ArrayList<Product>();
		
		al.add(new Product(102,"Table",5000,15));
		al.add(new Product(103,"Chair",6000,10));
		al.add(new Product(104,"Laptop",75000,5));
		al.add(new Product(105,"Mouse",300,25));
		al.add(new Product(106,"Keyboard",500,10));
		
		return al;
	}

}
