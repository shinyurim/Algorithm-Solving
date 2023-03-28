import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int solution(String[] babbling) {
        List<String> list = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma")); // 아이가 발음 할 수 있는 말은 "aya", "ye", "woo", "ma"뿐
        int answer = 0; // 조카가 발음 할 수 있는 단어의 갯수

        for (String s : babbling) {
            StringBuilder tmp = new StringBuilder();
            for (String str : list) {
                if(s.contains(str)){ // 만약 babbling을 받은 s에 str값이 들어가있으면
                    tmp.append(str); // tmp에 str문자를 더해준다
                }
            }
            if (tmp.length() == s.length()) { // 결과적으로 tmp의 길이와 babbling을 받은 s의 길이가 같으면 같은 문자라고 판단
                answer++; // answer의 카운트를 더해준다.
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(sol.solution(babbling));
        System.out.println(sol.solution(babbling2));
    }
}