class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;

       while (true){
           sum = sum * answer;
           if (sum > n){
               break;
           }
           answer++;
       }
        return answer - 1;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 3628800;
        int n2 = 7;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
    }
}