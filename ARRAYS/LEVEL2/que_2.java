package array_assignment;
import java.util.*;
public class que_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String[] names = {"Amar", "Akbar", "Anthony"};
	        int[] ages = new int[3];
	        int[] heights = new int[3]; // in cm

	        // Take input
	        System.out.println("Enter Age and Height for Amar, Akbar, and Anthony:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(names[i] + " Age: ");
	            ages[i] = sc.nextInt();

	            System.out.print(names[i] + " Height (in cm): ");
	            heights[i] = sc.nextInt();
	        }

	        // Find youngest
	        int minAgeIndex = 0;
	        for (int i = 1; i < 3; i++) {
	            if (ages[i] < ages[minAgeIndex]) {
	                minAgeIndex = i;
	            }
	        }

	        // Find tallest
	        int maxHeightIndex = 0;
	        for (int i = 1; i < 3; i++) {
	            if (heights[i] > heights[maxHeightIndex]) {
	                maxHeightIndex = i;
	            }
	        }

	        // Print results
	        System.out.println("\nResults:");
	        System.out.println("Youngest Friend: " + names[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
	        System.out.println("Tallest Friend: " + names[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)");

	        sc.close();
	}

}
