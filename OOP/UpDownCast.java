class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B Show");
    }
}

public class UpDownCast {
    public static void main(String[] args) {
        A obj = new B();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();

    }
}
