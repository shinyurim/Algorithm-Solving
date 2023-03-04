class Solution {
    public int solution(int n) {
        String answer = "";

        while (n != 0) { // n이 0이 아닐때까지
            answer += n % 3;// answer에 n을 3으로 나눈 나머지값을 더해주고
            n /= 3; // n을 3으로 나눠준다
        }
        return Integer.parseInt(answer, 3); // 3진수 → 10진수로 변환
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 45;
        int n2 = 125;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
    }
}