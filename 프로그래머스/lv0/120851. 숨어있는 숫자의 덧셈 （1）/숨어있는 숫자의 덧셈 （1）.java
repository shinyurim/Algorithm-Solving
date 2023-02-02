class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[A-Z|a-z]",""); // 문자열 공백으로 변환

        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.charAt(i) - '0'; // 문자열을 숫자로 변환
        }
        return answer;
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        String my_string = "1a2b3c4d123";
        System.out.println(sol.solution(my_string));
    }
}