// Circle class with constructor chaining
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // calling parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();      // default radius
        Circle c2 = new Circle(5.0);   // user-provided radius

        System.out.println("Default Circle:");
        c1.display();
        System.out.println("\nUser Circle:");
        c2.display();
    }
}

