public class VariablesDemo {

    // Instance variable — gets a default value automatically if not initialized
    static int uninitializedInstanceVar;

    public static void main(String[] args) {

        // ---- 1. Basic primitive declarations ----
        int age = 25;
        long population = 8_000_000_000L; // underscore for readability, L suffix mandatory
        double price = 19.99;
        float shortPrice = 19.99f; // f suffix mandatory
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("age = " + age);
        System.out.println("population = " + population);
        System.out.println("price = " + price);
        System.out.println("grade = " + grade);
        System.out.println("isJavaFun = " + isJavaFun);

        // ---- 2. Default value of an uninitialized instance variable ----
        System.out.println("Default instance int = " + uninitializedInstanceVar); // prints 0

        // ---- 3. Widening (implicit, automatic) ----
        int myInt = 100;
        double widened = myInt; // no cast needed
        System.out.println("Widened int->double = " + widened); // 100.0

        // ---- 4. Narrowing (explicit cast required) ----
        double myDouble = 9.99;
        int narrowed = (int) myDouble; // truncates, does NOT round
        System.out.println("Narrowed double->int = " + narrowed); // 9

        // ---- 5. Overflow wraparound ----
        int bigValue = 130;
        byte overflowed = (byte) bigValue;
        System.out.println("Overflowed byte = " + overflowed); // -126

        // ---- 6. Type promotion in arithmetic ----
        byte a = 10;
        byte b = 20;
        int sum = a + b; // byte+byte auto-promotes to int
        System.out.println("byte + byte = " + sum); // 30

        // ---- 7. Floating point precision surprise ----
        double result = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + result); // 0.30000000000000004, NOT 0.3!

        // ---- 8. var type inference ----
        var inferredInt = 42;
        var inferredString = "Hello Java";
        System.out.println(inferredInt + " " + inferredString);

        // ---- 9. final constant ----
        final double PI = 3.14159;
        System.out.println("PI = " + PI);
        // PI = 3.14; // uncommenting this line causes a compile error

        // ---- 10. Autoboxing / unboxing ----
        Integer wrappedInt = age; // autoboxing
        int unwrapped = wrappedInt; // unboxing
        System.out.println("Wrapped: " + wrappedInt + ", Unwrapped: " + unwrapped);
    }
}