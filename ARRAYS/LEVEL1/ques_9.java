package array_assignment;
import java.util.*;
public class ques_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Take rows and columns input
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        // Create 2D array
	        int[][] matrix = new int[rows][cols];

	        // Take input for 2D array
	        System.out.println("Enter elements of the 2D array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        // Create 1D array
	        int[] array = new int[rows * cols];
	        int index = 0;

	        // Copy elements from 2D to 1D
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[index] = matrix[i][j];
	                index++;
	            }
	        }

	        // Print 2D array
	        System.out.println("\n2D Array (Matrix):");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Print 1D array
	        System.out.println("\n1D Array after copying:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }

	        sc.close();
	}

}
