import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시험 본 과목의 갯수
        double score[] = new double[a];

        for (int i = 0; i < a; i++) {
            score[i] = sc.nextInt(); // 점수 입력받기
        }
        Arrays.sort(score); // 오름차순 정렬
        double max = score[a-1]; // 최댓값 = 오름차순 정렬 후 가장 마지막에 있는 값
        double ave = 0; // 평균값

        for (int i = 0; i < a; i++) {
            ave += (score[i]/max) * 100; // 합계 = 점수/최대값 * 100
        }
        System.out.println(ave/a); // 합계 / 시험본 과목의 갯수 = 평균
    }
}