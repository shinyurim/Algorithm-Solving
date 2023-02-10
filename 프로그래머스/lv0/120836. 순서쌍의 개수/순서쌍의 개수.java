class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n ; i++) { // 1부터 n까지 돌면서
            if (n % i == 0){ // n을 i로 나눈 나머지값이 0일때
                answer++; // answer을 ++ 해준다
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 20;
        int n2 = 100;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
    }
}