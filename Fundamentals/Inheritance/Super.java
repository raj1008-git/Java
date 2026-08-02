class A {
    public A() {
        System.out.println("In A");
    }

    public A(int n) {
        System.out.println("In A Int");
    }
}

class B extends A {
    public B() {
        super(5); 
        System.out.println("In B");
    }

    public B(int n) {

        // super(5);
        this();
        System.out.println("In B int");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
