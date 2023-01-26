class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String s : s1) {
            for (String value : s2) {
                if (s.equals(value)) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(sol.solution(s1,s2));
    }
}