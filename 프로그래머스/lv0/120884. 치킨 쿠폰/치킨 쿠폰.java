class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int newChicken = chicken / 10;
            int restChicken = chicken % 10;
            chicken = newChicken + restChicken;

            answer += newChicken;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        int chicken = 100;
        int chicken2 = 1081;
        System.out.println(sol.solution(chicken));
        System.out.println(sol.solution(chicken2));

    }
}