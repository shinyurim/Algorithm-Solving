class Solution {
    public int solution(int hp) {
        int answer = 0;

        answer += hp/5;
        hp %= 5;

        answer += hp/3;
        hp %= 3;

        answer += hp;

        return answer;

    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int hp = 999;
        System.out.println(sol.solution(hp));
    }
}