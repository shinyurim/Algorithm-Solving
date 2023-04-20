class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        int n = Integer.parseInt(("" + a + b));

        if (answer > n){
            return answer;
        } else {
            return n;
        }
    }
}