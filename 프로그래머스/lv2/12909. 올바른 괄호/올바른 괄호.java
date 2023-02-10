import java.util.Stack;

class Solution {
    boolean solution(String s) {
 
        while (true){
            Stack<Character> stack = new Stack<>();
            
            int a = -1;

            for (int i = 0; i < s.length() ; i++) {
                char ch = s.charAt(i);
                switch (ch){
                    case '(' :
                        stack.push(ch);
                        a++;
                        break;
                    case ')' :
                        if (a >= 0 && stack.peek() == '('){
                            stack.pop();
                            a--;
                        }else a--;
                        break;
                }
            }
            if (a == -1 && stack.size() == 0){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "()()";
        String s1 = "(())()";
        String s2 = ")()(";
        String s3 = "(()(";
        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
    }
}
