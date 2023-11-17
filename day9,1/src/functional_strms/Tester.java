package functional_strms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static utils.ShopUtils.*;

import com.shop.core.Product;

import static utils.IOUtils.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in);)
				{
				System.out.println("Enter file name and category");
				List<Product> list=new ArrayList<>();
				list=populateProductList();
				Map<Integer,Product> pmap=new HashMap<>();
				pmap=populateProductMap(list);
				storeProductDetails(pmap,sc.next(),sc.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over");
	}
						
}
