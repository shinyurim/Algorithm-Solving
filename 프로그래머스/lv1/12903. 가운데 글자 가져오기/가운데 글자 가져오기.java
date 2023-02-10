class Solution {
    public String solution(String s) {
        String answer = "";
        int middle = s.length() / 2; // 중간

        if (s.length() % 2 == 0){
            answer += s.substring(middle - 1, middle + 1);
        } else {
            answer += s.charAt(middle);
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();

        String s = "abcde";
        String s2 = "qwer";
        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s2));
    }
}