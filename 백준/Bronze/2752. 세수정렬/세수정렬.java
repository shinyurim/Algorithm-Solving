import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3]; // 숫자 3개를 담을 배열

        for (int i = 0; i < 3; i++) { // 숫자 받아주기
            num[i] = sc.nextInt();
        }

        Arrays.sort(num); // 오름차순 정렬
        for (int i = 0; i < 3; i++) {
            System.out.print(num[i] + " ");
        }
    }
}