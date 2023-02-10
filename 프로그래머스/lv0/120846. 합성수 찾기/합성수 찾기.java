class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int cnt = 0; // 약수가 3개 이상인 수를 셀 count 변수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    cnt++;
                }
            }
            if (cnt >= 3){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();

        int n = 10;
        int n2 = 15;

        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
    }
}