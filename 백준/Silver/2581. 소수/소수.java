import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        List<Integer> list = new ArrayList<>(); // 값을 담아줄 배열

        for (int i = m; i <= n; i++) {
            int cnt = 0; // 소수인지 아닌지 판별할 변수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt == 2) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum + "\n" + list.get(0));
        }
        sc.close();
    }
}