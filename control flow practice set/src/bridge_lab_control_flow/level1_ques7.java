package bridge_lab_control_flow;
import java.util.*;
public class level1_ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20 && day <= 31)   // March 20 - 31
                || (month == 4 && day >= 1 && day <= 30)    // April full
                || (month == 5 && day >= 1 && day <= 31)    // May full
                || (month == 6 && day >= 1 && day <= 20);   // June 1 - 20

if (isSpring) {
    System.out.println("It's a Spring Season");
} else {
    System.out.println("Not a Spring Season");
}
	}

}
