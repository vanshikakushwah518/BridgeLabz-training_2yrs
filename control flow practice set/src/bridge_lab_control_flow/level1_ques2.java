package bridge_lab_control_flow;
import java.util.*;
public class level1_ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt();
         if(num1<num2 && num1<num3) {
        	 System.out.println("first is the smallest of the 3 numbers");
         }
         else {
        	 System.out.println("first is not the smallest of the 3 numbers");
         }
	}

}
