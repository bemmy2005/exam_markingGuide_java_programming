package question5;

public class Main {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create authors
        Author author1 = new Author("1", "Author One", 50000);
        Author author2 = new Author("2", "Author Two", 60000);

        // Create books
        Book book1 = new Book("1", "Book One", "Author One", 29.99);
        Book book2 = new Book("2", "Book Two", "Author Two", 39.99);

        // Add authors to library
        library.addAuthor(author1);
        library.addAuthor(author2);

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Sell copies of books
        book1.sellCopy();
        book2.sellCopy();
        book2.sellCopy();

        // Update total revenue and expenses
        library.updateTotalRevenue(book1.getPrice() * book1.getCopiesSold());
        library.updateTotalRevenue(book2.getPrice() * book2.getCopiesSold());
        library.updateTotalExpenses(author1.getSalary());
        library.updateTotalExpenses(author2.getSalary());

        // Author receives royalties
        author1.receiveRoyalties(book1.getPrice() * book1.getCopiesSold() * 0.10); // Assuming 10% royalty
        author2.receiveRoyalties(book2.getPrice() * book2.getCopiesSold() * 0.10); // Assuming 10% royalty

        // Print the library state
        System.out.println(library);
    }
}

