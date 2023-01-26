import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 주어진 날짜

        int cnt = 0; // 위반하는 차량의 수

        for (int i = 0; i < 5; i++) {
            int car = sc.nextInt(); // 자동차의 일의자리 숫자
            
            if (a == car){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
     }