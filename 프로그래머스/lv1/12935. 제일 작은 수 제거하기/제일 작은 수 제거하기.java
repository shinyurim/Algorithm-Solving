import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1){ // 배열의 길이가 1일경우 -1
            int answer[] = {-1};
            return answer;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            min = Math.min(min,arr[i]); // Math.min() 함수 사용
        }

        int[] answer = new int[arr.length -1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }
        return answer;
    }
}