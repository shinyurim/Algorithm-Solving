class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0){ // 3의 배수
                n++;
            } else if (i % 3 != 0 && String.valueOf(i).contains("3")) {
                n++;
            }
           answer = n;
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 15;
        int n2 = 40;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
    }
}