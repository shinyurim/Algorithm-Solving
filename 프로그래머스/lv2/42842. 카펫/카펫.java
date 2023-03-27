import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        int width;

        for (int height = 3; height <= sum; height++) {
            if (sum % height != 0)
                continue;
            width = sum / height;
            if ((width - 2) * (height - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int brown = 10;
        int yellow = 2;
        int brown2 = 8;
        int yellow2 = 1;
        int brown3 = 24;
        int yellow3 = 24;
        System.out.println(Arrays.toString(sol.solution(brown, yellow)));
        System.out.println(Arrays.toString(sol.solution(brown2, yellow2)));
        System.out.println(Arrays.toString(sol.solution(brown3, yellow3)));
    }
}