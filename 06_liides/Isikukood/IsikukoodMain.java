package Isikukood;

public class IsikukoodMain {
    public static void main(String[] args) {
        isikukoodEE ee = new isikukoodEE("39812190214;");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthYear());
        System.out.println(ee.getBirthMonth());

        IsikukoodLV lv = new IsikukoodLV("120388-51237");
        System.out.println(lv.isMale());
        System.out.println(lv.getBirthYear());
        System.out.println(lv.getBirthMonth());
    }


}

