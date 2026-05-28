public class OperatorPrecedence {
    public static void main(String[] args) {
        int r1 = 10 + 5 * 2;
        int r2 = (10 + 5) * 2;
        int r3 = 20 / 4 + 3 * 2;
        int r4 = 20 / (4 + 3) * 2;
        System.out.println("10 + 5 * 2 = " + r1 + " (multiplication first)");
        System.out.println("(10 + 5) * 2 = " + r2 + " (parentheses override)");
        System.out.println("20 / 4 + 3 * 2 = " + r3 + " (left-to-right *,/,% before +,-)");
        System.out.println("20 / (4 + 3) * 2 = " + r4);
    }
}
