import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {

        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length / n; i++) {
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = num_list[i * n + j];
            }
            answer[i] = arr;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
       int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
       int n = 2;
       int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
       int n2 = 3;

        System.out.println(Arrays.deepToString(sol.solution(num_list, n)));
        System.out.println(Arrays.deepToString(sol.solution(num_list2, n2)));
    }
}