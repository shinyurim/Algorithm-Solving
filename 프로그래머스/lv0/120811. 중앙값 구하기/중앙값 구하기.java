import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array); // 배열 오름차순 정렬
        answer = array[array.length/2]; // 중앙값 찾기
        
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] array = {9,-1, 0};
        System.out.println(sol.solution(array));
    }
}