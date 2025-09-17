package array_assignment;
import java.util.*;
public class ques_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Create array of size 11
	        double[] heights = new double[11];
	        double sum = 0.0;

	        // Take input from user
	        System.out.println("Enter the heights of 11 players (in cm):");
	        for (int i = 0; i < heights.length; i++) {
	            System.out.print("Enter height of player " + (i + 1) + ": ");
	            heights[i] = sc.nextDouble();
	            sum += heights[i];  // add directly while taking input
	        }

	        // Calculate mean
	        double mean = sum / heights.length;

	        // Display result
	        System.out.println("\nMean height of the football team = " + mean + " cm");

	        sc.close();
	}

}
