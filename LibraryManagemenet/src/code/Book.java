package code;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable{

	private int Bookid;
	private String BookName;
	private String AuthorName;
	private String title;
	private double price;
	private LocalDate publishDate;
	private BookCategory c;
	
	
	public Book(int bookid, String bookName, String authorName, String title, double price, String publishDate,
			String c) {
		super();
		Bookid = bookid;
		BookName = bookName;
		AuthorName = authorName;
		this.title = title;
		this.price = price;
		this.publishDate =LocalDate.parse(publishDate);
		this.c =BookCategory.valueOf(c.toUpperCase());
	}


	public String getAuthorName() {
		return AuthorName;
	}


	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}


	public int getBookid() {
		return Bookid;
	}


	public void setBookid(int bookid) {
		Bookid = bookid;
	}


	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public LocalDate getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}


	public BookCategory getC() {
		return c;
	}


	public void setC(BookCategory c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "----Book Details---- \nBookid= " + Bookid + "\nBookName= " + BookName + "\nAuthorName= " + AuthorName + "\ntitle= " + title
				+ "\nprice= " + price + "\npublishDate= " + publishDate + "\nCategory= " + c ;
	}
	
}
