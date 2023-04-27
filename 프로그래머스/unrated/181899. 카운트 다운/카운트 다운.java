import java.util.Arrays;

class Solution {
    public int[] solution(int start, int end) {
        int num = start - end + 1;
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = start--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int start = 10;
        int end = 3;
        System.out.println(Arrays.toString(sol.solution(start, end)));
    }
}