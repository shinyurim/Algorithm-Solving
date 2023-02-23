import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0}; // x좌표 / y좌표 0에서부터 시작

        int maxWidth = (board[0] / 2); // 중앙(0,0)에서 시작해서 위 / 아래 / 좌 / 우 최대 움직일 수있는 값을 구하려면 2를 나누면 됌
        int minWidth = -(board[0] / 2);
        int maxLength = (board[1] / 2);
        int minLength = -(board[1] / 2);

        for (int i = 0; i < keyinput.length; i++) { // 입력된 keyInput만큼돌면서
            if (keyinput[i].equals("up")) { // "up"
                answer[1]++;
                if (answer[1] > maxLength) answer[1] = maxLength;
            } else if (keyinput[i].equals("down")) { // "down"
                answer[1]--;
                if (answer[1] < minLength) answer[1] = minLength;
            } else if (keyinput[i].equals("left")) { // "left"
                answer[0]--;
                if (answer[0] < minWidth) answer[0] = minWidth;
            } else if (keyinput[i].equals("right")) { // "right"
                answer[0]++;
                if (answer[0] > maxWidth) answer[0] = maxWidth;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};

        System.out.println(Arrays.toString(sol.solution(keyinput, board)));
    }
}