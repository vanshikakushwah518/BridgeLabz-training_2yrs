package bridge_lab_control_flow;
import java.util.*;
public class level2_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        if (number > 0) {
	            int i = 1;
	            while (i <= number) {
	                if (i % 3 == 0 && i % 5 == 0) {
	                    System.out.println("FizzBuzz");
	                } else if (i % 3 == 0) {
	                    System.out.println("Fizz");
	                } else if (i % 5 == 0) {
	                    System.out.println("Buzz");
	                } else {
	                    System.out.println(i);
	                }
	                i++; // increment loop
	            }
	        } else {
	            System.out.println("Please enter a positive integer!");
	        }
	}

}
