public class passwordLength {
    public static void main(String[] args) {
        int passwordLength = 9;

        boolean isSecure = passwordLength >= 8 && passwordLength <= 20;

        System.out.println("طول كلمة المرور: " + passwordLength);
        System.out.println("هل هي مقبولة؟ " + isSecure);
    }
}
