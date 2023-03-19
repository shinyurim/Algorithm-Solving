import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < a; i++) {
            boolean[] check = new boolean[26]; // 알파벳
            boolean TF = true;
            String b = sc.next();

            for (int j = 0; j < b.length(); j++) {
                int ckNum = b.charAt(j) - 'a';
                if (check[ckNum]) {
                    if (b.charAt(j) != b.charAt(j - 1)) {
                        TF = false;
                        break;
                    }
                } else {
                    check[ckNum] = true;
                }
            }
            if (TF) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}