class Solution {
    public int solution(int n) {
        int answer = 0; // n의 약수를 모두 더한 값

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 5;
        System.out.println(sol.solution(n));
    }
}