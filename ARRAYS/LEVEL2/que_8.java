package array_assignment;
import java.util.*;
public class que_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Step 1: Input number of students
	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        // Step 2: Arrays to store marks, percentage, grades
	        int[][] marks = new int[n][3]; // [Physics, Chemistry, Maths]
	        double[] percentage = new double[n];
	        char[] grade = new char[n];

	        // Step 3: Input marks for each student
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter marks for Student " + (i + 1));
	            
	            for (int j = 0; j < 3; j++) {
	                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
	                int m;
	                do {
	                    System.out.print(subject + " Marks: ");
	                    m = sc.nextInt();
	                    if (m < 0 || m > 100) {
	                        System.out.println("❌ Invalid! Marks should be between 0 and 100. Try again.");
	                    }
	                } while (m < 0 || m > 100);
	                marks[i][j] = m;
	            }

	            // Step 4: Calculate percentage
	            int total = marks[i][0] + marks[i][1] + marks[i][2];
	            percentage[i] = (total / 300.0) * 100;

	            // Step 5: Assign grade
	            if (percentage[i] >= 90) {
	                grade[i] = 'A';
	            } else if (percentage[i] >= 75) {
	                grade[i] = 'B';
	            } else if (percentage[i] >= 50) {
	                grade[i] = 'C';
	            } else {
	                grade[i] = 'D';
	            }
	        }

	        // Step 6: Display results
	        System.out.println("\n--- Student Report ---");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d | Percentage: %.2f%% | Grade: %c%n",
	                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
	        }

	        sc.close();
	}

}
