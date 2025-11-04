// Program to Model a Movie Ticket Booking System
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean booked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.booked = false;
    }

    // Method to book ticket
    void bookTicket(int seatNumber, double price) {
        if (!booked) {
            this.seatNumber = seatNumber;
            this.price = price;
            booked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked.");
        }
    }

    // Method to display ticket details
    void displayDetails() {
        if (booked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");
        ticket.bookTicket(12, 350);
        ticket.displayDetails();
    }
}

