// Book class with default and parameterized constructors
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book(); // default
        Book b2 = new Book("Java Basics", "Vanshika", 299.99); // parameterized

        System.out.println("Default Book:");
        b1.displayDetails();
        System.out.println("\nParameterized Book:");
        b2.displayDetails();
    }
}

