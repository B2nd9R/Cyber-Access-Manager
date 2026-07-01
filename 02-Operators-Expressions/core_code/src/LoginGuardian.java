public class LoginGuardian {
    public static void main(String args[]) {
        int maxAttempts = 3;
        int currentAttempts = 0;

        currentAttempts++;

        boolean isLockedOut = currentAttempts >= maxAttempts;

        boolean isPasswordCorrect = true;
        boolean isIpRecognized = true;

        boolean triggerAlert = isLockedOut || !isIpRecognized;

        boolean allowAccess = isPasswordCorrect && isIpRecognized;

        System.out.println("محالاوت الدخول: " + currentAttempts);
        System.out.println("هل الحساب محظور؟ " + isLockedOut);
        System.out.println("تشغيل الانذار؟ " + triggerAlert);
        System.out.println("هل تم السماح بالدخول؟ " + allowAccess);
    }
}
