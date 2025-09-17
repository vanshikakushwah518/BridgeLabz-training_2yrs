package array_assignment;
import java.util.*;
public class que_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: Create arrays
        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        // Step 3: Input weight & height
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Input weight with validation
            double w;
            do {
                System.out.print("Weight (kg): ");
                w = sc.nextDouble();
                if (w <= 0) System.out.println("Please enter a positive value!");
            } while (w <= 0);

            // Input height with validation
            double h;
            do {
                System.out.print("Height (m): ");
                h = sc.nextDouble();
                if (h <= 0) System.out.println("Please enter a positive value!");
            } while (h <= 0);

            // Store weight & height
            personData[i][0] = w;
            personData[i][1] = h;

            // Step 4: Calculate BMI
            personData[i][2] = w / (h * h);

            // Step 5: Find status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal Weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();

	}

}
