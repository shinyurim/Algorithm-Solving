import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int i = 0; i < A.length; i++) { // A와 B의 길이는 같다고 했으니, 아무 배열의 length면 상관없다
            listA.add(A[i]); // list배열에 옮겨닮아주기
            listB.add(B[i]);
        }

        Collections.sort(listA); // 오름차순 정렬
        Collections.sort(listB); // 오름차순 정렬
        Collections.reverse(listB); // 뒤집기(역순)

        for (int i = 0; i < listA.size(); i++) { // listA, B의 i번째 값을 꺼내서 곱해준 후 answer에 더해주기(누적합)
            answer += listA.get(i) * listB.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};
        int[] a2 = {1, 2};
        int[] b2 = {3, 4};

        System.out.println(sol.solution(a, b));
        System.out.println(sol.solution(a2, b2));
    }
}