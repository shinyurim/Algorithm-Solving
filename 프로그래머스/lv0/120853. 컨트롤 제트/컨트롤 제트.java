import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0; 
        
        String[] ch = s.split(" "); // 공백 기준으로 잘라주기
        Stack<String> stack = new Stack<>(); // stack 선언

        for (int i = 0; i < ch.length; i++) { // 자른 string배열만큼 돌면서
            if (!ch[i].equals("Z")){ // ch[i]가 "Z"가 아니면
                stack.push(ch[i]); // stack에 push(저장)
            }else { // 만약 ch[i]가 "Z"라면
                stack.pop(); // stack에서 pop(빼기)
            }
        }

        String[] str = new String[stack.size()]; // stack의 사이즈만큼 잡아주고

        for (int i = 0; i < str.length; i++) { // str배열의 길이만큼 돌면서
            str[i] = stack.get(i); // stack에 있던 숫자 배열 옮겨주기
        }

        for (int i = 0; i < str.length; i++) { // str배열의 길이만큼 돌면서
            answer += Integer.parseInt(str[i]); // answer에 str[i]값 더해주기(Integer.parseInt()를 통한 String → Int형 변환)
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String s = "1 2 Z 3";
        String s1 = "10 20 30 40";
        String s2 = "10 Z 20 Z 1";
        String s3 = "10 Z 20 Z";
        String s4 = "-1 -2 -3 Z";
        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
        System.out.println(sol.solution(s4));
    }
}