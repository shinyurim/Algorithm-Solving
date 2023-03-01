public class Solution {
    public int solution(int n) {
        int ans = 0; // 카운트용 변수
        int num = n;

        while (num != 0) { // num이 0이 아닐때까지
            if (num % 2 == 1) { // 만약 num값이 홀수면
                num = num - 1; // 1을 빼주고
                ans++; // 카운트 값 증가
            } else { // 만약 num값이 짝수면
                num /= 2; // 2로 나눠주기(순간이동)
            }
        }
        return ans; // 카운트값 리턴
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        int n = 5;
        int n2 = 6;
        int n3 = 5000;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
        System.out.println(sol.solution(n3));

    }
}