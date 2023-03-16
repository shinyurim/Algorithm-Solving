import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int avg = (a + b + c + d + e) / 5; // 평균

        int[] nums = {a, b, c, d, e};
        Arrays.sort(nums);
        int answer = nums[2]; // 중앙값


        System.out.print(avg + "\n" + answer);
        sc.close();
    }
}