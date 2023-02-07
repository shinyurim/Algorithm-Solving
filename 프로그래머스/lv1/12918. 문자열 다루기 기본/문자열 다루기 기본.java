class Solution {
    public boolean solution(String s) {
        

        if (!(s.length() == 4 || s.length() == 6)) return false; // 길이가 4거나 6이 아니면 false

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i); // 한글자씩 떼면서(i번째)
            if (!(chr >= '0' && chr <= '9')) return false;// 0~9까지 들어가있지 않으면 false
        }
        return true; // 그 외에는 true
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "12534";
        System.out.println(sol.solution(s));
    }
}