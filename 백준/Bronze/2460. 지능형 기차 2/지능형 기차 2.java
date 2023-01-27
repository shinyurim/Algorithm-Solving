import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0; // 최대 승객
        int total = 0; // 역마다의 총 승객

        for (int i = 0; i < 10; i++) {
            int drop = sc.nextInt(); // 내리는 사람
            int on = sc.nextInt(); // 타는 사람

            total = total - drop + on;
            if (total > max){
                max = total;
            }
        }
        System.out.println(max);
    }
}