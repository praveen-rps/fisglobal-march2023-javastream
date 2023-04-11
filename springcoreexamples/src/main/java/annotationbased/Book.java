package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	int isbn;
	String title;
	String author;
	public Book() {
		isbn=1001;
		title="micorservices";
		author="praveen";
	}
	
	public Book(int isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}
	

}
