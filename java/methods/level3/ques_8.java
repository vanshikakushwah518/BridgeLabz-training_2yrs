package level_4;
import java.util.HashSet;
import java.util.Random;

public class ques_8 {

    // Generate 6-digit OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    // Generate 10 OTPs
    public static int[] generateMultipleOTPs() {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Check uniqueness
    public static boolean checkUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = generateMultipleOTPs();
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        System.out.println("All OTPs unique? " + checkUnique(otps));
    }
}


