package Isikukood;

public class IsikukoodMain {
    public static void main(String[] args) {
        isikukoodEE ee = new isikukoodEE("39812190214;");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthYear());
        System.out.println(ee.getBirthMonth());
    }
}
