package bridge_lab_control_flow;
import java.util.*;
public class level2_q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int greatestFactor = 1;

	        for (int i = number - 1; i >= 1; i--) {
	            if (number % i == 0) {
	                greatestFactor = i;
	                break;
	            }
	        }

	        System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
	}

}
