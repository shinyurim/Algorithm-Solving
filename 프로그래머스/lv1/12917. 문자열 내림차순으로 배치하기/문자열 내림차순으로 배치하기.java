import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array);
        Collections.reverse(Arrays.asList(array));
        return String.join("",array);
    }
    public static void main(String args[]){
        Solution sol = new Solution();
       String s = "Zbcdefg";
        System.out.println(sol.solution(s));
    }
}