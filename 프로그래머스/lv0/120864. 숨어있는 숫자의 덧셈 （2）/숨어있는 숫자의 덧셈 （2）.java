import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-z|A-Z]"," ").split(" ");  // 영어 대,소문자 ""로 변경 후 자르기

        for(String s : str){ // forEach문을 돌면서
            if (!s.equals("")){ 
                answer += Integer.parseInt(s); // answer에 s값 더해주기(Integer.parseInt()를 통해 String → Int형으로 변환)
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123Z";
        System.out.println(sol.solution(my_string));
        System.out.println(sol.solution(my_string2));
    }
}