import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>(); // list선언

        for (int i = 0; i < strings.length; i++) { // for문을 돌면서
            list.add(strings[i].charAt(n) + strings[i]); // i번째 단어의 n번째 인덱스 값 + 단어
        }
        Collections.sort(list); // 오름차순 정렬

        String[] answer = new String[list.size()]; // 답을 담을 answer (answer의 사이즈 = list의 사이즈)

        for (int i = 0; i < list.size(); i++) { // for문을 돌면서
            answer[i] = list.get(i).substring(1); // 1번째 단어 자르기(1번째 인덱스부터 마지막까지)
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        System.out.println(Arrays.toString(sol.solution(strings, n)));
        System.out.println(Arrays.toString(sol.solution(strings2, n2)));
    }
}