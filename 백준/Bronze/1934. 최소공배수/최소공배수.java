import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = 1; // 최대공약수

            for (int j = 2; j <= Math.max(a, b); j++) {
                if (a % j == 0 && b % j == 0) {
                    gcd = j;
                }
            }
            System.out.println((a * b) / gcd);
        }
    }
}

