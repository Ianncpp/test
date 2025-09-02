import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a random number: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("YES");
            }
        }
    }
}