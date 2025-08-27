package bridge_lab_control_flow;
import java.util.*;
public class level2_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        if(n>=0) {
	        	System.out.println("number is positive");
	        	for(int i=1;i<=n;i++) {
	        		if(i%3==0) {
	        			System.out.println("fizz");
	        		}
	        		else if(i%5==0){
	                           System.out.println("buzz");
	        		}
	        		else {
	        			System.out.println(i);
	        		}
	        	}
	        }else {
	        	System.out.println("enter a positive number");
	        }
	}

}
