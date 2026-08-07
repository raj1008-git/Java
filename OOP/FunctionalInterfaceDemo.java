@FunctionalInterface
interface A {
    void show();

}

// class B implements A {
// public void show() {
// System.out.println("In Show");
// }
// }

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        A obj = () -> System.out.println("In Show");
        obj.show();
    };

}
