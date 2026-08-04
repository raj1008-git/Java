interface A {
    int age = 44;
    String area = "Mumbai";

    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In Config");
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
    }
}
