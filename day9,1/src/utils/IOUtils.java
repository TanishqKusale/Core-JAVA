package utils;

import java.util.Comparator;
import java.util.Map;

import com.shop.core.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public interface IOUtils {
	//Add a static method to store product details from a specific
	//category,sorted as per manu. date,in a text file using buffer.
	static void storeProductDetails(Map<Integer,Product> productMap,
			String filename,String categoryName) throws IOException
	{
		//parse from string to enum
		Category cat=Category.valueOf(categoryName.toUpperCase());
		//func literal
		Comparator<Product> comp=(p1,p2)->p1.getManufactureDate().compareTo(p2.getManufactureDate());
		//Java app -->PW-->FW-->text file
		try(PrintWriter pw=new PrintWriter(new FileWriter(filename)))
		
		{
			productMap.values() //Collection<Product>
			.stream() //Stream<Product>
			.filter(p->p.getProductCategory()==cat) //filtered Stream<Product>
			.sorted(comp)
			.forEach(p->pw.println(p)); //pw::println
		}//pw.close---pw.flush---fw.close 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

