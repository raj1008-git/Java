public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = 9;
        int num2 = num1.intValue();
        System.out.println(num1);

        String str = "20";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 2);

    }
}
