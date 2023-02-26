class Solution {
    public int solution(int n) {
        int answer = n + 1; // n의 다음 큰 숫자는 n보다 큰 자연수이므로, 기본값을 n + 1로 설정

        while (true) {
            if (Integer.bitCount(answer) == Integer.bitCount(n)) { // 만약 answer의 1의 개수가 n의 1의 개수와 같다면
                return answer;
            }
            answer++;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 78;
        int n2 = 15;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
    }
}