package array_assignment;
import java.util.*;
public class ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Take user input
	        System.out.print("Enter a positive integer: ");
	        int number = sc.nextInt();

	        if (number <= 0) {
	            System.out.println("Error: Please enter a positive integer.");
	            return;
	        }

	        // Create String array to save results
	        String[] results = new String[number + 1]; // +1 because we start from 0

	        // Fill array with FizzBuzz logic
	        for (int i = 0; i <= number; i++) {
	            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
	                results[i] = "FizzBuzz";
	            } else if (i % 3 == 0 && i != 0) {
	                results[i] = "Fizz";
	            } else if (i % 5 == 0 && i != 0) {
	                results[i] = "Buzz";
	            } else {
	                results[i] = String.valueOf(i);
	            }
	        }

	        // Print results with positions
	        System.out.println("\nFizzBuzz Results:");
	        for (int i = 0; i <= number; i++) {
	            System.out.println("Position " + i + " = " + results[i]);
	        }

	        sc.close();
	}

}
