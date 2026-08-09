public class ErrorHandling {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("I donot want to print");
            }
        } catch (ArithmeticException e) {

            System.out.println("Something went wrong" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your Limit");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
