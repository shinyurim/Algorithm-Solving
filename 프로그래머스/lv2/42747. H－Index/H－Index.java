// 문제가 이해하기 조금 어려우나, 결과적으로는 논문의 인용횟수와 확인한 논문수가 같을 때 해당 값을 return하는 문제라고 판단

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순정렬
        int max = 0;

        for (int i = citations.length - 1; i >= 0; i--) { // 배열을 역순으로 돌린다
            int min = Math.min(citations[i], citations.length - i); // 논문의 인용횟수와 확인한 논문수를 비교하여 min을 갱신해준다
            if (max < min) max = min; // 만약 min이 max보다 크면 max를 갱신
        }

        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(sol.solution(citations));
    }
}