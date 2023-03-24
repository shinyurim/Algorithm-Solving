class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int a = (dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0]);
        int b = (dots[2][1] - dots[3][1]) * (dots[0][0] - dots[1][0]);
        if (a == b || (Math.abs(a) == 1 && Math.abs(b) == 1)) return 1;


        a = (dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0]);
        b = (dots[1][1] - dots[3][1]) * (dots[0][0] - dots[2][0]);
        if (a == b || (Math.abs(a) == 1 && Math.abs(b) == 1))  return 1;


        a = (dots[0][1] - dots[3][1]) * (dots[2][0] - dots[1][0]);
        b = (dots[2][1] - dots[1][1]) * (dots[0][0] - dots[3][0]);
        if (a == b || (Math.abs(a) == 1 && Math.abs(b) == 1)) return 1;

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(sol.solution(dots));
        System.out.println(sol.solution(dots2));
    }
}