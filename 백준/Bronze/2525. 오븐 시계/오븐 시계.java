import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D;

        D = (A * 60) + B + C;
        A = D / 60;
        B = D % 60;

        if (A >= 24){
            A = (A - 24);
        }
        System.out.println(A + " " + B);
        }
    }