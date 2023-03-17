import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            switch (input) {
                case "push": // "pust"(정수 X를 스택에 넣는 연산)
                    stack.push(sc.nextInt());
                    break;

                case "top": // "top"(가장위에 있는 정수 출력)
                    if (!stack.empty()) { // 스택이 비어있지 않다면
                        stringBuilder.append(stack.peek()).append('\n'); // peek을 이용해 마지막에 들어갔던 수를 찾아주고
                    } else { // 스택이 비어있으면
                        stringBuilder.append("-1").append('\n'); // -1을 출력
                    }
                    break;

                case "pop": // "pop"(스택의 가장위에 있는 정수 출력 + 정수 빼기)
                    if (!stack.empty()) { // 스택이 비어있지 않다면
                        stringBuilder.append(stack.pop()).append('\n'); // pop을 이용해 마지막에 들어갔던 수를 찾아주고 + 마지막에 들어갔던 수 제거
                    } else { // 스택이 비어있으면
                        stringBuilder.append("-1").append('\n'); // -1을 출력
                    }
                    break;

                case "size": // "size"(스택에 들어있는 사이즈의 개수)
                    stringBuilder.append(stack.size()).append('\n'); // size를 이용해 스택의 사이즈 크기를 구해줌
                    break;

                case "empty": // "empty"(스택이 비어있으면)
                    if (stack.empty()) { // 스택이 비어있으면
                        stringBuilder.append("1").append('\n'); // 1을 출력
                    } else { // 스택이 비어있지 않으면
                        stringBuilder.append("0").append('\n'); // 0을 출력
                    }
                    break;
            }
        }

        System.out.println(stringBuilder);
    }
}