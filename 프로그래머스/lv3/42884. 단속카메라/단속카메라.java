import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] routes) {
        int cnt = 0;
        int min = Integer.MIN_VALUE;

        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));

        for (int[] route : routes) {
            if (min < route[0]) {
                min = route[1];
                cnt++;
            }
        }
        return cnt;
    }
}