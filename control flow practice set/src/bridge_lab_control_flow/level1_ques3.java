package bridge_lab_control_flow;
import java.util.*;
public class level1_ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt();
         if(num1>num2 && num1>num3) {
        	 System.out.println("first number is largest");
         }else if(num2>num1 &&num2>num3) {
        	 System.out.println("second number is largest");
         }else {
        	 System.out.println("third number is largest");
         }
	}

}
