
public class Inheritance {
    public static void main(String[] args) {
        // Calc obj = new Calc();
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);

        System.out.println(r1 + " " + r2);
    }
}