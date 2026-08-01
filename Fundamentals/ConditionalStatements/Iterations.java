public class Iterations {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi" + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("World" + (j + 1));
            }
        }
    }
}