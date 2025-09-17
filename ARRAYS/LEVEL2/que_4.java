package array_assignment;
import java.util.*;
public class que_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Step 1: Take number input
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int maxDigit = 10; // initial size of array
	        int[] digits = new int[maxDigit];
	        int index = 0;

	        // Step 2: Extract digits and store in array
	        while (number != 0) {
	            // If array is full, increase size by 10
	            if (index == maxDigit) {
	                maxDigit += 10;  // increase size
	                int[] temp = new int[maxDigit]; // new array with bigger size

	                // copy old elements to new array
	                for (int i = 0; i < digits.length; i++) {
	                    temp[i] = digits[i];
	                }

	                digits = temp; // reassign
	            }

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

	        // Step 4: Display results
	        System.out.print("Digits stored: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(digits[i] + " ");
	        }
	        System.out.println();

	        System.out.println("Largest Digit = " + largest);
	        if (secondLargest != -1) {
	            System.out.println("Second Largest Digit = " + secondLargest);
	        } else {
	            System.out.println("Second Largest Digit does not exist");
	        }

	        sc.close();
	}

}
