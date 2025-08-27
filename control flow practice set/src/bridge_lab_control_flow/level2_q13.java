package bridge_lab_control_flow;
import java.util.*;
public class level2_q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter base number: ");
	        int number = sc.nextInt();
	        System.out.print("Enter power: ");
	        int power = sc.nextInt();

	        int result = 1;
	        int counter = 0;

	        while (counter < power) {
	            result *= number;
	            counter++;
	        }

	        System.out.println(number + " raised to the power " + power + " is: " + result);
	}

}
