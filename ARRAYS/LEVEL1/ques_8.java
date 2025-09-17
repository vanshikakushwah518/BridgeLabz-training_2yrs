package array_assignment;
import java.util.*;
public class ques_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Initial size of factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // i is a factor
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2; // double the size
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j]; // copy elements
                    }
                    factors = temp; // reassign
                }

                // Store factor in array
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
	}

}
