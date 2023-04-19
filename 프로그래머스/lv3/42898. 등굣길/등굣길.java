class Solution {
    public int solution(int m, int n, int[][] puddles) {

        int[][] map = new int[n + 1][m + 1];
        int num = 1000000007;
        map[1][1] = 1;

        for (int i = 0; i < puddles.length; i++) {
            map[puddles[i][1]][puddles[i][0]] = -1; // 웅덩이
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (map[i][j] == -1) continue;  //웅덩이인 경우
                if (map[i - 1][j] > 0) map[i][j] += map[i - 1][j] % num;    // 왼쪽
                if (map[i][j - 1] > 0) map[i][j] += map[i][j - 1] % num;    // 위쪽
            }
        }
        return map[n][m] % num;
    }
}