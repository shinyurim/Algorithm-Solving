import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;  // 이수한 과목의 총 학점
        double sum = 0.0;  // 전공평점의 합

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            
            if (!grade.equals("P")) {  // 등급이 P가 아니면 계산에 포함
                n += credit;
                switch (grade) {  // 등급에 따라 과목평점을 계산
                    case "A+":
                        sum += 4.5 * credit;
                        break;
                    case "A0":
                        sum += 4.0 * credit;
                        break;
                    case "B+":
                        sum += 3.5 * credit;
                        break;
                    case "B0":
                        sum += 3.0 * credit;
                        break;
                    case "C+":
                        sum += 2.5 * credit;
                        break;
                    case "C0":
                        sum += 2.0 * credit;
                        break;
                    case "D+":
                        sum += 1.5 * credit;
                        break;
                    case "D0":
                        sum += credit;
                        break;
                    case "F":
                        sum += 0.0;
                        break;
                }
            }
        }

        double average = sum / n;  // 전공평점 계산
        System.out.println(average);
    }
}