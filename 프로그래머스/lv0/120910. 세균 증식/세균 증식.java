class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
       int n = 7;
       int t = 15;
        System.out.println(sol.solution(n,t));
    }
}