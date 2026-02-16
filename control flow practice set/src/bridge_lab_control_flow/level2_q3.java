package bridge_lab_control_flow;
import java.util.*;
public class level2_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        // Print multiplication table from 6 to 9
	        for (int i = 6; i <= 9; i++) {
	            System.out.println(number + " * " + i + " = " + (number * i));
	        }
	}

}
