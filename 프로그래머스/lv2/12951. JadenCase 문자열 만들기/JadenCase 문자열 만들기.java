class Solution {
    public String solution(String s) {
      String answer = "";
        answer += Character.toUpperCase(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' '){
                answer += Character.toUpperCase(s.charAt(i + 1));
            }else {
                answer += Character.toLowerCase(s.charAt(i + 1));
            }
        }
        return answer;
    }
    public static void main(String args[]) {
        Solution sol = new Solution();
        String s = "3people unFollowed me";
        System.out.println(sol.solution(s));
    }
}