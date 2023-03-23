class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num = 0;

        if (common[1] - common[0] == common[2] - common[1]) {
            num = common[1] - common[0];
            answer = common[common.length - 1] + num;
        } else if (common[1] / common[0] == common[2] / common[1]) {
            num = common[1] / common[0];
            answer = common[common.length - 1] * num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] common = {1, 2, 3, 4};
        int[] common2 = {2, 4, 8};
        System.out.println(sol.solution(common));
        System.out.println(sol.solution(common2));
    }
}