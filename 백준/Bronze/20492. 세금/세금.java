import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int one = (int) (n - (n * 0.22));
        int two = (int) (n -((n - (n * 0.8)) * 0.22));
        System.out.print(one + " " + two);
    }
}