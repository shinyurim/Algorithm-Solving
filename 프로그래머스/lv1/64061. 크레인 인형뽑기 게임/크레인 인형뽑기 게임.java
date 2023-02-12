import java.util.Stack;

class Solution {
    public int solution(int[][]board, int[] moves){
        int answer = 0; // 터트린 인형의 총 갯수를 셀 answer

        Stack<Integer> stack = new Stack<>(); // stack선언

        for(int p : moves){
            for(int i = 0; i < board.length; i++){
                if(board[i][p-1] != 0){ // 만약 인형이 있으면
                    int temp = board[i][p-1]; // 해당 위치의 인형(숫자) = tmp
                    board[i][p-1] = 0; // 인형을 뽑았으니 해당 자리는 0으로 바꿈
                    if(!stack.isEmpty() && stack.peek() == temp){ // 만약 stack에 이미 인형이 들어있고, 마지막에 넣었던 인형과 같다면?
                        stack.pop(); // 마지막으로 들어갔던 인형 버리기
                        answer +=2; // 같은 짝이 맞는 인형이 터졌으니까 2를 더해주고
                    }else{
                        stack.push(temp); // 위의 조건에 부합하지 않는다면(마지막으로 들어간 인형이 같지않다면) stack에 push해준다
                    }
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(sol.solution(board,moves));

    }
}