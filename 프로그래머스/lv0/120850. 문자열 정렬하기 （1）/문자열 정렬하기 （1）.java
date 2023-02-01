import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {

       my_string =  my_string.replaceAll("[A-Z|a-z]",""); // replaceAll을 이용하여 대문자 / 소문자 전부 ""로 변경
        int[] answer = new int[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i)-'0'; // 아스키 코드값으로 '0' 은 48
        }
        Arrays.sort(answer); // 결과를 오름차순으로 정렬해줌
        return answer;
        }

    public static void main(String args[]){
        Solution sol = new Solution();
        String my_string = "abcde0";
        System.out.println(Arrays.toString(sol.solution(my_string)));
    }
}