import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length() ; i++) { // String의 길이만큼 돌면서
            if (my_string.indexOf(my_string.charAt(i)) == i){ // 
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();

       String s = "people";
       String s2 = "We are the world";

        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s2));
    }
}