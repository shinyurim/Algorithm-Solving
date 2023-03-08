class Solution {
    public int solution(int M, int N) {
        return (M - 1) + M * (N - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int M = 2;
        int N = 2;
        int M2 = 2;
        int N2 = 5;
        int M3 = 1;
        int N3 = 1;

        System.out.println(sol.solution(M, N));
        System.out.println(sol.solution(M2, N2));
        System.out.println(sol.solution(M3, N3));
    }
}