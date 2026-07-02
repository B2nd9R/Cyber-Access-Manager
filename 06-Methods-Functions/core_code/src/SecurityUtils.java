public class SecurityUtils {
    public static String maskSensitiveData (String rawData) {
        if (rawData.contains("@")) {
            String masked = rawData.substring(0, 3) + "****" + rawData.substring(rawData.indexOf("@"));
            return masked;
        }
        return "بيانات غير صالحة";
    }

    public static void main(String[] args) {
        String adminEmail = "101010@gulf.edu.sa";
        String securedEmail = maskSensitiveData(adminEmail);

        System.out.println("سجلات الحماية: " + securedEmail);
    }
}
