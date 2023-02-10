import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] <= emergency[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] emergency = {3, 76, 24};
        int[] emergency2 = {1,2,3,4,5,6,7};
        int[] emergency3 = {30, 10, 23, 6, 100};

        System.out.println(Arrays.toString(sol.solution(emergency)));
        System.out.println(Arrays.toString(sol.solution(emergency2)));
        System.out.println(Arrays.toString(sol.solution(emergency3)));
    }
}
