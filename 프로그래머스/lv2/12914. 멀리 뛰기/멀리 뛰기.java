class Solution {
    public long solution(int n) {

        if (n == 1){
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int[] dp = new int[n + 1]; // dp용 메모리
        dp[1] = 1; // 칸이 1개일 때 나올 수 있는 경우의 수는 1
        dp[2] = 2; // 칸이 2개일 때 나올 수 있는 경우의 수는 2

        for (int i = 3; i <= n; i++) { // 3부터 n까지
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567; // (i - 1번째 값 + i - 2번째 값)를 1234567로 나눈 값
        }

        return dp[n];
}
    public static void main(String args[]){
        Solution sol = new Solution();
       int n = 4;
       int n2 = 3;
       int n3 = 1;
       int n4 = 2;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
        System.out.println(sol.solution(n3));
        System.out.println(sol.solution(n4));

    }
}