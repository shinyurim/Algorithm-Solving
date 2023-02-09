import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>(); // list 배열 이용

        for (int i = 1; i <= n; i++) { // 1부터 n까지 돌면서
            if (n % i == 0){ // 만약 n을 i로 나눈 나머지값이 0이면(딱 맞아 떨어지면)
                list.add(i); // list에 추가
            }
        }
        int[] answer = new int[list.size()]; // int배열은 list의 사이즈만큼 잡아주고

        for (int i = 0; i < list.size(); i++) { // list의 사이즈만큼 돌면서
           answer[i] = list.get(i); // answer[i]에 list의 i번째 객체를 가지고 와 더해준 후
        }
        return answer; // answer을 return 한다
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 24;
        int n2 = 29;
        System.out.println(Arrays.toString(sol.solution(n)));
        System.out.println(Arrays.toString(sol.solution(n2)));
    }
}