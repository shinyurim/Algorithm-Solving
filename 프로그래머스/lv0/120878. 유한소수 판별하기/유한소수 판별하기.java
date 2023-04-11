// 결과적으로 우리는 b의(분모)의 값만 알면 된다.

class Solution {
    public int solution(int a, int b) {

        int gcd = 1; // 최대공약수

        for (int i = 1; i < Math.max(a, b); i++) { // 최대공약수 구하기
            if (a % i == 0 && b % i == 0) {
                if (gcd < i) {
                    gcd = i;
                }
            }
        }

        b = b / gcd; // 분모를 최대공약수로 나눈 값으로 갱신

        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        if (b == 1) {
            return 1;
        } else return 2;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 12;
        int b = 21;
        System.out.println(sol.solution(a, b));
    }
}