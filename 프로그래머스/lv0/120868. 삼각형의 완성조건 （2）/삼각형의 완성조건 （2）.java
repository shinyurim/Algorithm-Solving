class Solution {
    public int solution(int[] sides) {
        int bigNum = Math.max(sides[0], sides[1]);
        int smallNum = Math.min(sides[0], sides[1]);

        return (bigNum + smallNum) - (bigNum - smallNum) - 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides = {1, 2};
        int[] sides2 = {3, 6};
        int[] sides3 = {11, 7};

        System.out.println(sol.solution(sides));
        System.out.println(sol.solution(sides2));
        System.out.println(sol.solution(sides3));

    }
}