class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) < 97){ // 대문자일때
                answer.append((char) (my_string.charAt(i) + 32)); // * (char)를 안붙이면 문자가 아닌 숫자로 출력됨
            }else { // 소문자일때
                answer.append((char) (my_string.charAt(i) - 32));
            }
        }
        return answer.toString();
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String my_string = "abCdEfghIJ";
        System.out.println(sol.solution(my_string));
    }
}