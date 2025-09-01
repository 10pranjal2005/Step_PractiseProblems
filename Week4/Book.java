public class Book {
    String title;
    String author;
    double price;

    // TODO: Default constructor
    public Book() {
        this.title = "Untitled Book";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // TODO: Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // TODO: Display method
    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: Create book1 using default constructor
        Book book1 = new Book();

        // TODO: Create book2 using parameterized constructor
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);

        // TODO: Display both books
        System.out.println("--- Book 1 (Default) ---");
        book1.display();
        System.out.println("--- Book 2 (Parameterized) ---");
        book2.display();
    }
}