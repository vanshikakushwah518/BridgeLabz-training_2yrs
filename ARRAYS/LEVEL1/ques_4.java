package array_assignment;
import java.util.*;
public class ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        // Array to hold max 10 numbers
	        double[] numbers = new double[10];
	        double total = 0.0;
	        int index = 0;

	        System.out.println("Enter numbers (max 10). Enter 0 or negative number to stop:");

	        // Infinite loop
	        while (true) {
	            System.out.print("Enter number " + (index + 1) + ": ");
	            double num = sc.nextDouble();

	            // Break if 0 or negative entered
	            if (num <= 0) {
	                break;
	            }

	            // Break if array is full
	            if (index == 10) {
	                System.out.println("Array is full. Cannot add more numbers.");
	                break;
	            }

	            // Store number in array
	            numbers[index] = num;
	            index++;
	        }

	        System.out.println("\nNumbers entered:");
	        for (int i = 0; i < index; i++) {
	            System.out.println(numbers[i]);
	            total += numbers[i];
	        }

	        System.out.println("\nTotal sum = " + total);

	        sc.close();
	       
	}

}
