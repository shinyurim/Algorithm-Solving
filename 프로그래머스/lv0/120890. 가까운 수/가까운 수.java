import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(n - array[i]) < min){
                answer = array[i];
                min = n - array[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
       int [] array = {10,11,12};
       int n = 13;
        System.out.println(sol.solution(array,n));
    }
}