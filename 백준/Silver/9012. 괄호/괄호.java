import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        Stack<Character> stack = new Stack<>();
        String s = sc.nextLine();

        for (int i = 0; i < T; i++) { //테스트 데이터의 갯수만큼 for문을 돌리면서
            s = sc.nextLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j); // j번째 인덱스를 하나씩 받아
                if(stack.isEmpty()) stack.push(c); // 만약 스택이 비어있으면 해당 문자열을 stack에 추가
                else { // 스택이 비어있지 않은 경우
                    if(c == ')') { // 만약 c가 ')'일때
                        if(stack.peek() == '(') { // 스택에 들어갔던 마지막 문자가 '('이면
                            stack.pop(); // pop을 이용해서 마지막에 들어갔던 문자 제거
                        }
                        else { // 스택에 들어갔던 마지막 문자가 '('가 아니면
                            stack.push(c); // 스택에 c 문자열을 추가
                        }
                    }else { // 그 외의 경우
                        stack.push(c); // 스택에 c 문자열을 추가
                    }
                }
            }
            if(stack.isEmpty()) { // 만약 스택이 비어있다면 올바른 문자열이라고 판단
                System.out.println("YES"); // yes출력
            }else { // 비어있지 않다면 올바르지 않은 문자열이라고 판단
                System.out.println("NO"); // no출력
            }
            stack.clear();
        }
    }
}