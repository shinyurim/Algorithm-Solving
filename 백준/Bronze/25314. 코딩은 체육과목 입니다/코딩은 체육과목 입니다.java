import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < a / 4; i++) {
            answer.append("long ");
        }
        System.out.println(answer + "int");
    }
}