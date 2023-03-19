import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 갯수

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt(); // 반복횟수
            String s = sc.next(); // 문자열 받아주기

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(s.charAt(j));
                }
                if (j == s.length()-1){ // 만약 문자열의 마지막 인덱스까지 확인하면
                    System.out.println(); // 줄바꿈
                }
            }
        }
        sc.close();
    }
}