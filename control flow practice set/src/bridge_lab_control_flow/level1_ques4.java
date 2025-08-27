package bridge_lab_control_flow;
import java.util.*;
public class level1_ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if(n>=0) {
        	 System.out.println("n is natural number");
        	 int sum = (n*(n+1))/2;
        	 System.out.println(sum);
         }else {
        	 System.out.println("n is not a natural number");
         }
	}

}
