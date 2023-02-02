import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int num1, int num2) {

        String answer = "";
        String[] tmp = my_string.split("");

        Collections.swap(Arrays.asList(tmp), num1, num2);

        for (int i = 0; i < tmp.length; i++) {
            answer += tmp[i];
        }
        return answer;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        System.out.println(sol.solution(my_string, num1, num2));
    }
}