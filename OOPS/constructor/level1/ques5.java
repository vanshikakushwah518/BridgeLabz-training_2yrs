// Library Book System
class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have borrowed \"" + title + "\" successfully.");
        } else {
            System.out.println("\"" + title + "\" is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Basics", "Vanshika", 299.99);
        book1.display();
        book1.borrowBook();
        book1.display();
    }
}

