import java.util.*;
public class level1_ques3 {
      Scanner sc = new Scanner(System.in);
	      int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          int num3 = sc.nextInt();
          if(num1<num2 && num1<num3){
            System.out.println("first is the smallest of the 3 numbers");
          }
          else{
            System.out.println("first number is not the smallest number");
          }
}
