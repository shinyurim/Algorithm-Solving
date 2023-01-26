class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = n;
        while (number != 0){
            answer += number % 10;
            number /= 10;
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 930211;
        System.out.println(sol.solution(n));
    }
}