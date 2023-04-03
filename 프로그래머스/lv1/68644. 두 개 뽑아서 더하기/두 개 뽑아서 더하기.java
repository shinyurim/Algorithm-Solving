// 해당문제는 hashset을 이용하여 중복없이 값을 저장하고, 마지막에 배열로 변경 + 오름차순을 적용하여 return해주는 문제

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) { // 두개를 뽑아서 만들 수 있는 수를 구할 for문
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]); // set에 저장해준다(중복저장 X)
            }
        }

        int[] answer = new int[set.size()];
        int index = 0;

        for (int num : set) { // for문을 돌면서 set의 값을 배열로 만들어줌
            answer[index++] = num;
        }

        Arrays.sort(answer); // 오름차순 정렬

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {5, 0, 2, 7};
        System.out.println(Arrays.toString(sol.solution(numbers)));
    }
}