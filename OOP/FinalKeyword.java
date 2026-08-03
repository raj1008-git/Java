class Calc {
    final public void show() {
        System.out.println("In Calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {
    @Override
    public void show() {
        System.out.println("By John");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);

    }
}
