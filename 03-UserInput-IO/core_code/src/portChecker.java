import static java.lang.IO.readln;

public class portChecker {
    public static void main(String[] args) {

        System.out.print("أدخل كود الـ OTP: ");
        String otpCode = readln();

        System.out.print("أدخل رقم منفذ السيرفر (Port): ");
        String input1 = readln();
        int port = Integer.parseInt(input1);

        boolean isAccessGranted = otpCode.equals("2026") && port == 8080;

        System.out.println("حالة السماح بالدخول: " + isAccessGranted);
    }
}