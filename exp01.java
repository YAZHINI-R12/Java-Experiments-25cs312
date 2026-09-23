class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    Book(int bookId, String title, String author,
         String category, double price, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    void displayBookDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Category  : " + category);
        System.out.println("Price     : Rs." + price);
        System.out.println("Available : " + available);
    }
}

public class exp01 {
    public static void main(String[] args) {
        Book b1 = new Book(
            101,
            "Java Programming",
            "James Gosling",
            "Programming",
            500.0,
            true
        );

        Book b2 = new Book(
            102,
            "Python Programming",
            "Guido van Rossum",
            "Programming",
            600.0,
            false
        );

        System.out.println("BOOK 1");
        System.out.println("------");
        b1.displayBookDetails();

        System.out.println("\nBOOK 2");
        System.out.println("------");
        b2.displayBookDetails();
    }
}
