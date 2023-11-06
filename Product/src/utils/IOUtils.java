package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.shop.core.Product;

public interface IOUtils {
//add a method to store product details in a bin file using ser.
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException{
		// Java App --> OOS --> FOS (bin file)
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(map);//ser.
		}
	}
}
