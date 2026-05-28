public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("double " + d + " cast to int: " + i);
        int j = 42;
        double e = j;
        System.out.println("int " + j + " widened to double: " + e);
    }
}
