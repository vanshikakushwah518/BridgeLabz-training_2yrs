package bridge_lab_control_flow;
import java.util.*;
public class level2_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         if(n>0) {
        	 System.out.println("number is positive");
        	  for(int i=1;i<=n;i++) {
        		  if(n%i==0) {
        			  System.out.println(i);
        		  }
        	  }
         }
         else {
        	 System.out.println("enter a positive number");
         }
	}

}
