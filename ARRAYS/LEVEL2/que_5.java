package array_assignment;
import java.util.*;
public class que_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Step 1: Take input
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        // Step 2: Count digits
	        int temp = number;
	        int count = 0;
	        while (temp != 0) {
	            count++;
	            temp /= 10;
	        }

	        // Step 3: Extract digits into an array
	        int[] digits = new int[count];
	        temp = number;
	        for (int i = count - 1; i >= 0; i--) {
	            digits[i] = temp % 10;
	            temp /= 10;
	        }

	        // Step 4: Create reverse array
	        int[] reversed = new int[count];
	        for (int i = 0; i < count; i++) {
	            reversed[i] = digits[count - 1 - i];
	        }

	        // Step 5: Display reversed array
	        System.out.print("Reversed Number: ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(reversed[i]);
	        }

	        sc.close();
	}

}
