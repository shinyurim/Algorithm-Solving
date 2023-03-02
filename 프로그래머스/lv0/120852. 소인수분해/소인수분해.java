import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!arr.contains(i))
                    arr.add(i);
                n /= i;
            }
        }

        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        int n = 12;
        int n2 = 17;
        int n3 = 420;

        System.out.println(Arrays.toString(sol.solution(n)));
        System.out.println(Arrays.toString(sol.solution(n2)));
        System.out.println(Arrays.toString(sol.solution(n3)));
    }
}