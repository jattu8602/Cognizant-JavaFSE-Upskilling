/**
 * Exercise 37: Using javap to Inspect Bytecode
 * 
 * Compile: javac BytecodeInspection.java
 * Inspect: javap -c BytecodeInspection
 */
public class BytecodeInspection {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        BytecodeInspection obj = new BytecodeInspection();
        System.out.println(obj.add(3, 4));
    }
}
