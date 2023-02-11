import java.util.*;
// stack을 사용해서 스택의 사이즈가 0이면 무조건 push 
// stack.peek을 사용해서 값이 같으면 저장X 다르면 저장 O
public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>(); // stack선언

        for (int i = 0; i < arr.length; i++) { // 배열의 길이만큼 돌면서
            if (stack.size() == 0){ // 스택의 사이즈가 0이면(비어있으면 / isEmpty로 바꿔사용해도 될 것 같다)
                stack.push(arr[i]); // arr[i]에 해당하는 숫자 넣어주기

            } else if (stack.size() != 0 && stack.peek() == arr[i]) { // 사이즈가 0이아니고(비어있지않고) 마지막에 들어간 숫자가 i번째 숫자랑 같으면
                continue; // 지나가요~~!
            }else {
                stack.push(arr[i]); // 그게 아니면 숫자 넣어주기 
            }
        }
        int[] answer = new int[stack.size()]; // stack의 사이즈만큼 배열의 크기를 잡아준다
        
        int num = 0;
        
        for(int s : stack){ // foreach문을 돌면서
            answer[num] = s; // answer[0]부터 숫자를 넣어준다
            num++;
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        System.out.println(Arrays.toString(sol.solution(arr)));
        System.out.println(Arrays.toString(sol.solution(arr2)));
    }
}