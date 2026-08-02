class Calculator {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class Oop {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(4, 4);

    }
}