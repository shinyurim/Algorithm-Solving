class Solution {
    public int solution(int n) {
        int answer = 1; // 기본 1판부터 시작!(피자 판 수)
        int slice = 6; // 6조각 Fix

        for (int i = 0; i < Math.max(slice,n) ; i++) { // n과 slice(6)중에 더 큰 값만큼 돌면서
            if ((answer * slice) % n == 0){ // answer * slice(6)를 사람수(n)으로 나눈 나머지값이 0이면
                return answer; // 바로 answer을 return
            }else { // 그게 아니면
                answer++; // answer의 카운트를 증가시켜줌
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 6;
        int n2 = 10;
        int n3 = 4;

        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
        System.out.println(sol.solution(n3));
    }
}