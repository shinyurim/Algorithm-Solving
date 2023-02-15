class Solution {
    public int solution(int n) {
        if (n <= 2){
            return n;
        }else {
            return (memo(n - 1) + memo(n - 2)) % 1234567;
        }
    }
    public int memo(int n){
        int[] dp = new int[n < 2 ? 2 : n + 1]; // dp용 메모리 / n이 2보다 작으면 dp배열의 크기 2 아니면 n + 1로 잡아준다
        dp[0] = 0; // 문제에서 F(0) = 0 이라고 함
        dp[1] = 1; // 문제에서 F(1) = 1 이라고 함

        for (int i = 2; i <= n ; i++) { // 피보나치는 f(2)부터 성립되므로 2부터 n까지
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567; // i는 (i - 1) + (i - 2) + 문제에서 피보나치 수를 1234567로 나눈 나머지를 구하라고 했으니까 나눠주기
        }
        return dp[n];
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 3;
        int n2 = 5;
        int n3 = 100000;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
        System.out.println(sol.solution(n3));
    }
}