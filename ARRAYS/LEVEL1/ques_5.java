package array_assignment;
import java.util.*;
public class ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        // Take input number
	        System.out.print("Enter a number to print its multiplication table (from 6 to 9): ");
	        int number = sc.nextInt();

	        // Define array of size 4 (for 6, 7, 8, 9)
	        int[] multiplicationResult = new int[4];

	        // Store multiplication results
	        for (int i = 6; i <= 9; i++) {
	            multiplicationResult[i - 6] = number * i;
	        }

	        // Display results
	        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
	        for (int i = 6; i <= 9; i++) {
	            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
	        }

	        sc.close();
	}

}
