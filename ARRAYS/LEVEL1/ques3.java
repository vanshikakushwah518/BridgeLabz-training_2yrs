package array_assignment;
import java.util.*;
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Get number input
	        System.out.print("Enter a number to print its multiplication table: ");
	        int number = sc.nextInt();

	        // Define an array to store results (size 10 for 1 to 10)
	        int[] table = new int[10];

	        // Store multiplication results in array
	        for (int i = 1; i <= 10; i++) {
	            table[i - 1] = number * i; // store in array
	        }

	        // Display results
	        System.out.println("\nMultiplication Table of " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " * " + i + " = " + table[i - 1]);
	        }

	        sc.close();
	}

}
