public class TypeCasting {
    public static void main(String[] args) {
        float marks = 99.999f;
        int roundoff = (int) marks;
        System.out.println(roundoff);

        char c = 'A';
        int b = c;
        System.out.println(b);
    }
}
