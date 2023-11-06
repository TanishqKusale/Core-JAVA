package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import static utils.IOUtils.storeProductDetails;
import static utils.ShopUtils.*;

public class TestSerialization {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product details(map) from utils
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Enter file name");
			// invoke IOUtils method for storing products
			storeProductDetails(productMap, sc.nextLine());
			System.out.println("stored product details ....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
