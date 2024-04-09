public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        // char c = a - b;
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(a);
        System.out.println(b-a);

        // lossy conversion
        short s = 5;
        byte y = 25;
        char c = 'a';
        byte z = (byte) (s + y + c);
        System.out.println(z);

        // promotion
        int p = 34;
        float f = 25.25f;
        long l = 777;
        double d = 54.546d;
        double ans = (p + f + l + d);
        System.out.println(ans);

        // expression
        byte n = 5;
        //byte m = 2 * n;      // Wrong
        byte m = (byte) (2 * n);
        System.out.println(m);

    }
}
