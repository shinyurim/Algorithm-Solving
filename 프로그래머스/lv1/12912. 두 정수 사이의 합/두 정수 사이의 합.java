

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b){
            for (int i = a; i <=b ; i++) {
                answer += i;
            }
        } else if (a > b) {
            for (int i = b; i <=a ; i++) {
                answer += i;
            }
        }else if (a == b){
            return a;
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int a = 5;
        int b = 3;
        System.out.println(sol.solution(a,b));
    }
}