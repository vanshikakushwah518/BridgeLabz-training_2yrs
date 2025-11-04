// HotelBooking class with default, parameterized, and copy constructors
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking(); // default
        HotelBooking hb2 = new HotelBooking("Vanshika", "Deluxe", 3); // parameterized
        HotelBooking hb3 = new HotelBooking(hb2); // copy

        System.out.println("Default Booking:");
        hb1.displayBooking();
        System.out.println("\nParameterized Booking:");
        hb2.displayBooking();
        System.out.println("\nCopied Booking:");
        hb3.displayBooking();
    }
}

