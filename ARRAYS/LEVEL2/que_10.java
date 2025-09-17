package array_assignment;
import java.util.*;
public class que_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Step 1: Input number
	        System.out.print("Enter a number: ");
	        long num = sc.nextLong();

	        // Step 2: Count digits & store them in an array
	        String numStr = Long.toString(num);
	        int length = numStr.length();
	        int[] digits = new int[length];

	        for (int i = 0; i < length; i++) {
	            digits[i] = numStr.charAt(i) - '0'; // convert char to int
	        }

	        // Step 3: Frequency array of size 10 (for digits 0–9)
	        int[] freq = new int[10];

	        for (int d : digits) {
	            freq[d]++; // increase count for each digit
	        }

	        // Step 4: Display frequency of each digit
	        System.out.println("\nDigit Frequency:");
	        for (int i = 0; i < 10; i++) {
	            if (freq[i] > 0) {
	                System.out.println("Digit " + i + " -> " + freq[i] + " times");
	            }
	        }

	        sc.close();
	}

}
