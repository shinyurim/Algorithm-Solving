class Solution {
    public static String solution(String s) {

        int[] alp = new int[26]; // 알파벳의 갯수

        for (int i = 0; i < s.length(); i++)
            alp[s.charAt(i) - 'a']++;

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < alp.length; j++)
            if (alp[j] == 1)
                sb.append((char) ('a' + j));

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcabcadc";
        String s2 = "abdc";
        String s3 = "hello";
        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));

    }
}