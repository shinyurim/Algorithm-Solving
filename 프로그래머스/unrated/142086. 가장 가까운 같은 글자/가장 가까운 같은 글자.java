import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            answer[i] = map.containsKey(chars[i]) ? i - map.get(chars[i]) : -1;
            map.put(chars[i], i);
        }
        return answer;
    }
}