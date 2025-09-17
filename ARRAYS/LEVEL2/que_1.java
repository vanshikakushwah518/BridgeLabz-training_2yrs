package array_assignment;
import java.util.*;
public class que_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Arrays for 10 employees
	        double[] salary = new double[10];
	        double[] yearsOfService = new double[10];
	        double[] bonus = new double[10];
	        double[] newSalary = new double[10];

	        // Totals
	        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

	        // Input salaries and years of service
	        System.out.println("Enter Salary and Years of Service for 10 employees:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("\nEmployee " + (i + 1) + " Salary: ");
	            double s = sc.nextDouble();

	            System.out.print("Employee " + (i + 1) + " Years of Service: ");
	            double y = sc.nextDouble();

	            // Validation
	            if (s <= 0 || y < 0) {
	                System.out.println("❌ Invalid input. Please enter again.");
	                i--; // repeat this employee input
	                continue;
	            }

	            salary[i] = s;
	            yearsOfService[i] = y;
	        }

	        // Calculate bonus, new salary, and totals
	        for (int i = 0; i < 10; i++) {
	            if (yearsOfService[i] > 5) {
	                bonus[i] = 0.05 * salary[i];  // 5% bonus
	            } else {
	                bonus[i] = 0.02 * salary[i];  // 2% bonus
	            }
	            newSalary[i] = salary[i] + bonus[i];

	            totalBonus += bonus[i];
	            totalOldSalary += salary[i];
	            totalNewSalary += newSalary[i];
	        }

	        // Print employee details
	        System.out.println("\nEmployee Details (Old Salary, Bonus, New Salary):");
	        for (int i = 0; i < 10; i++) {
	            System.out.printf("Employee %d -> Old Salary: %.2f | Bonus: %.2f | New Salary: %.2f%n",
	                    (i + 1), salary[i], bonus[i], newSalary[i]);
	        }

	        // Print totals
	        System.out.println("\n===== Company Totals (Zara) =====");
	        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
	        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
	        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

	        sc.close();
	}

}
