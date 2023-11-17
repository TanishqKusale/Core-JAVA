package tester;

import static util.libraryMethods.*;
import code.Book;
import code.BookCategory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import code.Book;

public class TesterBook {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		List<Book> dList=new ArrayList<Book>();
		dList=bList();
		//dList=getFromFile("Book.ser");
		Comparator<Book> comp=(b1,b2)-> b1.getAuthorName().compareTo(b2.getAuthorName());
		//dList.forEach(System.out::println);
		boolean exit=false;
		
		while(!exit) {
			try{
				
				System.out.println("1.Add new Book\n2.Sort(Author Name)\n3.Search Author(thriller)\n4.Book publis in year 2000"
						+ "\n5.Store and exit");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Bookid,Book Name,Author Name, title, price, publishDate, Category");
					dList.add(new Book(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next()));
					break;
				case 2:
					//Comparator<Book> comp=(b1,b2)-> b1.getAuthorName().compareTo(b2.getAuthorName());
					dList.stream().sorted(comp).forEach(System.out::println);
					break;
				case 3:
					//dList.stream().filter(b->b.getPublishDate().getYear()==2000).forEach(System.out::println);
					dList.stream().sorted(comp).filter(s->s.getC().equals(BookCategory.valueOf("thriller".toUpperCase())))
					.forEach(System.out::println);
					break;
				case 4:
					for(Book b:dList) {
						
						int y=b.getPublishDate().getYear();
						
						if(y==2000) {
							System.out.println(b);
						}
					}
					break;
				case 5:
					System.out.println("Exited Sucessfully");
					storeInFile(dList,"Book.ser");
					exit=true;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
