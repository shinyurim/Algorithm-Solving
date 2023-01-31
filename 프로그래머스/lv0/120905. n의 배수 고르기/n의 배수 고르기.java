import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) { // 나머지가 0이면 n의 배수라고 판단
                arrayList.add(num); // ArrayList에 저장
            }
        }

        int[] answer = new int[arrayList.size()]; // 저장된 숫자의 수만큼 배열크기를 잡아주고

        for (int i = 0; i < arrayList.size(); i++) { // arrayList의 사이즈만큼 돌면서
            answer[i] = arrayList.get(i); // answer에 수를 담아준다
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};
        System.out.println(Arrays.toString(sol.solution(n, numlist)));
    }
}