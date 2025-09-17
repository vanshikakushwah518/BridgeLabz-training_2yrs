package level_4;
import java.util.Scanner;

public class ques_9 {

    // Month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Leap year check
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // First day of month using Zeller’s Congruence
    public static int firstDayOfMonth(int month, int year) {
        int q = 1;
        int m = (month < 3) ? month + 12 : month;
        int Y = (month < 3) ? year - 1 : year;
        int K = Y % 100;
        int J = Y / 100;
        int h = (q + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
        return (h + 6) % 7; // 0 = Sunday
    }

    // Display calendar
    public static void printCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        } else {
            daysInMonth[2] = 28;
        }

        System.out.println("     " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = firstDayOfMonth(month, year);
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}

