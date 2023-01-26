class Solution {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) { // 1부터 n의 갯수만큼 돌면서
            answer += i % 2 == 0 ? "수" : "박"; // 정수가짝수면 '수' 홀수면 '박'
            }
        return answer;
        }
}