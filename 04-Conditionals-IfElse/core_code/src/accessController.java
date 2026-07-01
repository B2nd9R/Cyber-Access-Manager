public class accessController {
    public static void main(String[] args) {
        String userRole = "User";

        if (userRole.equals("Admin")) {
            System.out.println("هلا والله بالادمن");
        } else if (userRole.equals("Developer")) {
            System.out.println("اهلاً بالمطور، تم نقلك الى الداشبورد المخصص");
        } else if (userRole.equals("User")) {
            System.out.println("اهلاً بك يالمستخدم، بامكانك تجربة المنصة");
        }
        else {
            System.out.println("ليس لديك الصلاحية بالوصول");
        }
    }
}
