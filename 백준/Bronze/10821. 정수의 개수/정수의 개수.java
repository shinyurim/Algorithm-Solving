import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] str = s.split(",");

        System.out.println(str.length);
        sc.close();
    }
}
