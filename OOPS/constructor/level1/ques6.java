// Car Rental System
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay;

    // Constructor
    CarRental(String customerName, String carModel, int rentalDays, double ratePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.ratePerDay = ratePerDay;
    }

    double totalCost() {
        return rentalDays * ratePerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rate per Day: ₹" + ratePerDay);
        System.out.println("Total Cost: ₹" + totalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Vanshika", "Toyota Corolla", 5, 1500);
        rental.displayRental();
    }
}
