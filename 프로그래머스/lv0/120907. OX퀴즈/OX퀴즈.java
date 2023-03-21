import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");

            int X = Integer.parseInt(s[0]); // 첫번째 숫자
            int Y = Integer.parseInt(s[2]); // 두번째 숫자
            int Z = Integer.parseInt(s[4]); // 결과 값

            int cal = 0; // 계산을 위한 변수

            if (s[1].equals("-")) { // 만약 부호가 "-"라면
                cal = X - Y; // 두 값 빼기
            } else { // 만약 부호가 "+"라면
                cal = X + Y; // 두 값 더하기
            }
            answer[i] = Z == cal ? "O" : "X"; // 만약 결과값(Z)와 cal변수의 값(계산값)이 같다면 옳은 수식이라고 판단하여 "O"를 넣어주고, 아니라면 "X"를 넣어준다.
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(sol.solution(quiz)));
        System.out.println(Arrays.toString(sol.solution(quiz2)));
    }
}