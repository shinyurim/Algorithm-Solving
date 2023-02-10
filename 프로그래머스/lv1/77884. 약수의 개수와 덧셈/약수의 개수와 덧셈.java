class Solution {
    public int solution(int left, int right) {
        
        int answer = 0;

        for (int i = left; i <= right; i++) { // left부터 right까지 돌면서
            int cnt = 0; // 약수 갯수(카운트!)
               for (int j = 1; j <= i; j++) { // 1부터 i까지 돌면서
                 if (i % j == 0) { // i 를 j 로 나눈 나머지값이 0이면(약수면)
                    cnt++; // 카운트 증가
                }
            }
                if (cnt % 2 == 0) { //만약 카운트 수(약수의 갯수가) 짝수면
                    answer += i; // answer 에 현재 i값을 더해주고
                } else answer -= i; // 홀수면 현재 i값을 빼준다
            }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();

        int left = 13;
        int right = 17;
        int left2 = 24;
        int right2 = 27;
        System.out.println(sol.solution(left,right));
        System.out.println(sol.solution(left2, right2));
    }
}