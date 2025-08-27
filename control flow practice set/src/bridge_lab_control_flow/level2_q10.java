package bridge_lab_control_flow;
import java.util.*;
public class level2_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive integer less than 100: ");
	        int number = sc.nextInt();

	        if (number > 0 && number < 100) {
	            System.out.println("Multiples of " + number + " below 100 are:");
	            for (int i = 1; i * number < 100; i++) {
	                System.out.print((i * number) + " ");
	            }
	        } else {
	            System.out.println("Number must be positive and less than 100!");
	        }
	}

}
