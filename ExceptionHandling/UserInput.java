import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        Scanner sc = new Scanner(System.in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        int num = sc.nextInt();
        System.out.println(num);

    }
}
