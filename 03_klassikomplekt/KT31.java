class KT31 {
    public class KT3 {
        static int a = 5;
        static int b = 3;
    }
    public class KT32 {
        static int c = 4;
        static int d = 2;
    }
    public static void main(String[] args) {
        int e = KT3.a + KT3.b;
        int f = KT32.c + KT32.d;
        System.out.println(e + f);
    }
}