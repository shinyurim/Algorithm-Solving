import java.util.Arrays;

class Solution {
    public String[] solution(String my_str, int n) {
        int size = (my_str.length() % n == 0) ? (my_str.length() / n) : (my_str.length() / n + 1);
        String[] answer = new String[size];

        for (int i = 0; i < answer.length; i++) {
            int start = n * i;
            int end = my_str.length() > start + n ? start + n : my_str.length();
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        String my_str2 = "abcdef123";
        int n2 = 3;

        System.out.println(Arrays.toString(sol.solution(my_str, n)));
        System.out.println(Arrays.toString(sol.solution(my_str2, n2)));
    }
}