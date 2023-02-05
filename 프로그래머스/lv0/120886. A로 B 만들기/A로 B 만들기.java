import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] beforeArray = before.split("");
        String[] afterArray = after.split("");
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        String answer = String.join("", beforeArray);
        String answer2 = String.join("", afterArray);

        if (answer.equals(answer2)){
            return 1;
        }else return 0;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String before = "allpe";
        String after = "apple";
        System.out.println(sol.solution(before, after));
    }
}