class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        String[] stra1 = str1.split("");
        String[] stra2 = str2.split("");

        for (int i = 0; i < str1.length(); i++) {
            answer += stra1[i];
            answer += stra2[i];
        }
        return answer;
    }
}