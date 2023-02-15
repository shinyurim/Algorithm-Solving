import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length]; // 최종 return할 변수 (등수를 담아 return)
        int[] sum = new int[score.length]; // 합을 계산할 변수

        int cnt = 0; // 둥수를 계산할 변수

        for (int i = 0; i < score.length; i++) {
            sum[i] += score[i][0] + score[i][1]; 
        }
        for (int i = 0; i < sum.length; i++) {
            cnt = 1;
            for (int j = 0; j < sum.length; j++) {
                if (sum[i] < sum[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
       int [][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
       int [][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        System.out.println(Arrays.toString(sol.solution(score)));
        System.out.println(Arrays.toString(sol.solution(score2)));
    }
}