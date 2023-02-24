class Solution {
    public int solution(int n) {
        int answer = 0; // n을 연속한 자연수들로 표현하는 방법의 갯수를 저장할 변수
        int start = 1; // 투포인터 start
        int end = 1; // 투포인터 end
        int sum = 0; // 누적합을 구할 변수

        while (end <= n + 1){
            if (sum < n){ // 만약 sum(누적합)이 n보다 작으면
                sum += start; // start값을 더해주기
                start++; // start포인터를 한 칸 오른쪽으로 이동
            } else if (sum >= n) { // 만약 sum(누적합)이 n보다 크면
                sum -= end; // end값을 빼주기
                end++; // end포인터를 한 칸 오른쪽으로 이동
            }
            if (sum == n) { // 누적합이 n과 같으면
                answer++; // answer 카운트 증가
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 15;
        System.out.println(sol.solution(n));
    }
}