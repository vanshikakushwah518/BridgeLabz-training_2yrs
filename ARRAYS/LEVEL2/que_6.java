package array_assignment;
import java.util.*;
public class que_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Step 1: Input number of persons
	        System.out.print("Enter number of persons: ");
	        int n = sc.nextInt();

	        // Step 2: Arrays to store data
	        double[] weight = new double[n];
	        double[] height = new double[n];
	        double[] bmi = new double[n];
	        String[] status = new String[n];

	        // Step 3: Input weight and height
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Person " + (i + 1));
	            System.out.print("Weight (kg): ");
	            weight[i] = sc.nextDouble();
	            System.out.print("Height (m): ");
	            height[i] = sc.nextDouble();
	        }

	        // Step 4: Calculate BMI & status
	        for (int i = 0; i < n; i++) {
	            bmi[i] = weight[i] / (height[i] * height[i]); // Formula

	            if (bmi[i] < 18.5) {
	                status[i] = "Underweight";
	            } else if (bmi[i] < 25) {
	                status[i] = "Normal Weight";
	            } else if (bmi[i] < 30) {
	                status[i] = "Overweight";
	            } else {
	                status[i] = "Obese";
	            }
	        }

	        // Step 5: Display results
	        System.out.println("\n--- BMI Report ---");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
	                    (i + 1), height[i], weight[i], bmi[i], status[i]);
	        }

	        sc.close();
	}

}
