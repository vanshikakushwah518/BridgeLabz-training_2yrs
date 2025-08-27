package bridge_lab_control_flow;
import java.util.*;
public class level2_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter employee salary: ");
	        double salary = sc.nextDouble();
	     
	        System.out.print("Enter years of service: ");
	        int years = sc.nextInt();

	        double bonus = 0;

	        if (years > 5) {
	            bonus = salary * 0.05;
	            System.out.println("Bonus amount: " + bonus);
	        } else {
	            System.out.println("No bonus (less than or equal to 5 years of service).");
	        }
	}

}
