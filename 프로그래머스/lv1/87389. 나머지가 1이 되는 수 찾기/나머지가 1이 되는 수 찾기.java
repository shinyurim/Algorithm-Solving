
class Solution {
    public int solution(int n) {
        int min = 999999;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) { // n을 i로 나눴을 때 나머지가 1이 되는 자연수 일때
                if (i < min) min = i;
            } else min = min;
        }

        return min;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 999984;
        System.out.println(sol.solution(n));
    }
}