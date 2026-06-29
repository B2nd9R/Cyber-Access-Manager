import java.util.Scanner;

import static java.lang.IO.readln;

public class OTPVerify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ادخل اسم الادمن: ");
        String adminName = input.nextLine();

        System.out.print("ادخل رمز التحقق: ");
        String otpCode = readln();

        boolean isOtpVaild = otpCode.equals("1234");

        System.out.println("---فحص تسجيل الدخول---");
        System.out.println("المسؤول الحالي: " + adminName);
        System.out.println("رمز التحقق اللي تم ادخاله: " + otpCode);
        System.out.println("حالة التحقق الثنائي: " + isOtpVaild);
    }
}
