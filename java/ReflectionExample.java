import java.lang.reflect.Method;

/**
 * Exercise 39: Reflection in Java
 * Dynamically loads a class and invokes methods.
 */
public class ReflectionExample {

    static class Sample {
        public void greet(String name) {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample$Sample");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
            if (m.getName().equals("greet")) {
                m.invoke(obj, "World");
            }
        }
    }
}
