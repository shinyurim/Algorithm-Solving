import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2]; // [최댓값, 최댓값에 해당하는 index]
        int max = 0; // 최댓값을 구하기 위한 변수
        int index = 0; // 해당 최댓값에 해당하는 index 구하기 위한 변수
        
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }


    public static void main(String args[]) {
        Solution sol = new Solution();
           int[] array = {9,10,11,8};
        System.out.println(Arrays.toString(sol.solution(array)));
    }
}