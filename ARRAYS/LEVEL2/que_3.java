package array_assignment;
import java.util.*;
public class que_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Step 1: Take number input
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int maxDigit = 10; // array size limit
	        int[] digits = new int[maxDigit];
	        int index = 0;

	        // Step 2: Extract digits and store in array
	        while (number != 0 && index < maxDigit) {
	            int digit = number % 10;     // get last digit
	            digits[index] = digit;       // store in array
	            index++;                     // move to next position
	            number = number / 10;        // remove last digit
	        }

	        // Step 3: Find largest and second largest
	        int largest = -1;
	        int secondLargest = -1;

	        for (int i = 0; i < index; i++) {
	            if (digits[i] > largest) {
	                secondLargest = largest; // shift down
	                largest = digits[i];
	            } else if (digits[i] > secondLargest && digits[i] != largest) {
	                secondLargest = digits[i];
	            }
	        }

	        // Step 4: Display result
	        System.out.println("Largest Digit = " + largest);
	        if (secondLargest != -1) {
	            System.out.println("Second Largest Digit = " + secondLargest);
	        } else {
	            System.out.println("Second Largest Digit does not exist");
	        }

	        sc.close();
	}

}
