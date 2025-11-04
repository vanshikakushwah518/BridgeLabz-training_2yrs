class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double circumference() {
        return 2 * Math.PI * radius;
    }

    // Display details
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        c1.display();
    }
}

