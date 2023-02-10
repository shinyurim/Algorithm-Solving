import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcd = 0;

        for (int i = 1; i < Math.max(n,m); i++) {
            if (n % i == 0 && m % i == 0){
             gcd = i;
            }
        }

        int lcm = (n * m) / gcd;
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 3;
        int m = 12;
        int n2 = 2;
        int m2= 5;
        System.out.println(Arrays.toString(sol.solution(n,m)));
        System.out.println(Arrays.toString(sol.solution(n2,m2)));
    }
}