import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // https://pl.spoj.com/problems/RNO_DOD/
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int output = 0;
            while (n > 0) {
                output += scanner.nextInt();
                n--;
            }
            System.out.println(output);
            t--;
        }
    }
}
