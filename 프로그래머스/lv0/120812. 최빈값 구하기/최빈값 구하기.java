import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            cnt = map.getOrDefault(array[i], 0) + 1;

            if (cnt > max) {
                max = cnt;
                answer = array[i];
            } else if (cnt == max) {
                answer = -1;
            }
            map.put(array[i], cnt);
        }
        return answer;
    }
}