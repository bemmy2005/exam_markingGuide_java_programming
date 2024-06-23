package question5;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private List<Author> authors;
	private double totalRevenue;
	private double totalExpenses;

	// Constructor
	public Library() {
		this.books = new ArrayList<>();
		this.authors = new ArrayList<>();
		this.totalRevenue = 0;
		this.totalExpenses = 0;
	}

	// Getters and Setters
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public double getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	public double getTotalExpenses() {
		return totalExpenses;
	}

	public void setTotalExpenses(double totalExpenses) {
		this.totalExpenses = totalExpenses;
	}

	// Method to add a book
	public void addBook(Book book) {
		this.books.add(book);
	}

	// Method to add an author
	public void addAuthor(Author author) {
		this.authors.add(author);
	}

	// Method to update total expenses
	public void updateTotalExpenses(double amount) {
		this.totalExpenses += amount;
	}

	// Method to update total revenue
	public void updateTotalRevenue(double amount) {
		this.totalRevenue += amount;
	}
}