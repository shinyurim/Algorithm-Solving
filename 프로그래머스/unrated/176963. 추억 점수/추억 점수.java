// map을 이용하여 풀이하였음. name을 key에, yearning을 value에 넣은 후 이중for문을 돌면서 해당 값에 해당하는 key가 비어있지 않다면,
// map에서 key에 맞는 value를 더해준다. 이후 안쪽 for문을 빠져나와 answer배열에 더한 값을 저장해준다.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // 결과적으로 answer배열의 크기는 photo와 같다
        Map<String, Integer> map = new HashMap<>(); // key와 value값을 저장하기 위한 map

        for (int i = 0; i < name.length; i++) { // map에 key와 value를 넣기위한 for문
            map.put(name[i], yearning[i]); // key에는 name이 저장되고, value에는 yearning값이 저장된다.
        }

        for (int i = 0; i < photo.length; i++) { // 각 배열의 그리움 점수를 담기위한 바깥쪽 for문
              int cnt = 0; // 안쪽 배열 하나를 돌 때마다 cnt수 초기화(새로운 계산을 위해)
                  for (int j = 0; j < photo[i].length; j++) { // 각 배열의 그리움 점수를 담기위한 안쪽 for문
                       if (map.get(photo[i][j]) != null) { // 만약 map.get에 해당하는 key가 비어있지않다면 (존재한다면)
                           cnt += map.get(photo[i][j]); // cnt에 key에 해당하는 value값을 더해줌
                       }
                 }
               answer[i] = cnt; // 총 계산값을 answer배열에 저장
            }
           return answer;
      }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
        System.out.println(Arrays.toString(sol.solution(name, yearning, photo)));
    }
}