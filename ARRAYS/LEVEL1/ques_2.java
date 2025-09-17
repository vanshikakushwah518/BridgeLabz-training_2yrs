package array_assignment;
import java.util.*;
public class ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Define array of 5 integers
	        int[] numbers = new int[5];

	        // Take user input
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            numbers[i] = sc.nextInt();
	        }

	        System.out.println("\nResults:");
	        // Check conditions for each number
	        for (int i = 0; i < numbers.length; i++) {
	            int num = numbers[i];
	            if (num > 0) {
	                if (num % 2 == 0) {
	                    System.out.println(num + " is Positive and Even");
	                } else {
	                    System.out.println(num + " is Positive and Odd");
	                }
	            } else if (num < 0) {
	                System.out.println(num + " is Negative");
	            } else {
	                System.out.println(num + " is Zero");
	            }
	        }

	        // Compare first and last element
	        System.out.println("\nComparison of First and Last Element:");
	        if (numbers[0] == numbers[numbers.length - 1]) {
	            System.out.println("First element (" + numbers[0] + ") is Equal to Last element (" + numbers[numbers.length - 1] + ")");
	        } else if (numbers[0] > numbers[numbers.length - 1]) {
	            System.out.println("First element (" + numbers[0] + ") is Greater than Last element (" + numbers[numbers.length - 1] + ")");
	        } else {
	            System.out.println("First element (" + numbers[0] + ") is Less than Last element (" + numbers[numbers.length - 1] + ")");
	        }

	        sc.close();
	}

}
