import java.util.Arrays;
import java.util.Stack;

// stack사용 풀이
class Solution {
    public int solution(String s) {
        Stack<String> stack= new Stack<>();

        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            if (!stack.isEmpty() && stack.peek().equals(str[i])){
                stack.pop();
            }else {
                stack.push(str[i]);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String s = "baabaa";
        String s2 = "cdcd";
        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s2));
    }
}