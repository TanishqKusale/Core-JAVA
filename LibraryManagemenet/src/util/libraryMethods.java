package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import code.Book;

public class libraryMethods {
	
	public static List<Book> bList(){
		
		List<Book> list=new ArrayList();
		
		list.add(new Book(01,"Java","Sam","JAVA ADVANCE",1500,"2005-12-16","MANUAL"));
		list.add(new Book(02,"DARK","Tom","DARK",1000,"2005-12-16","THRILLER"));
		list.add(new Book(03,"MIND GAMES","Mark","MIND GAMES",1550,"2005-12-16","PSYCHOLOGY"));
		list.add(new Book(04,"LIFE","Jerry","LIFE",1600,"2005-12-16","SELFIMPORVEMENT"));
		list.add(new Book(05,"UP ABOVE THE SKY","Rick","UP ABOVE THE SKY",2500,"2005-12-16","CLASSICLITERATURE"));
		
		
		return list;
	}
	
	public static void storeInFile(List<Book> list,String fname) throws FileNotFoundException, IOException {
		
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(fname));
		o.writeObject(list);	
		
	}
	
	public static List<Book> getFromFile(String fname) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream n=new ObjectInputStream(new FileInputStream(fname));
		return(List<Book>) n.readObject();
	}

}
