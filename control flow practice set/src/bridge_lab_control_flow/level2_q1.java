package bridge_lab_control_flow;
import java.util.*;
public class level2_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a natural number: ");
	        int number = sc.nextInt();
	        if(number>0) {
	        	for(int i=1;i<=number;i++) {
	        		if(i%2==0) {
	        			System.out.println(i + "is an even number");
	        		}
	        		 else {
	        			System.out.println(i + "is an odd number");
	        		}
	        	}
	        }
	          else {
	        		System.out.println("enter a positive number");
	        	}
	        

	}

}
