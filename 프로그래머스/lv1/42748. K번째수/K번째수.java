import java.util.Arrays;

class Solution {
    //순서 → 반복문을 돌리면서 Arrays.copyOfRange를 이용하여 배열 복사
    //      → 해당 배열 정렬하기
    //        → [i][2] - 1에 해당하는 인덱스의 값을 i번째에 차곡차곡 저장
    //          → Return
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copy);
            answer[i] = copy[commands[i][2]-1];
        }
       return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(sol.solution(array,commands)));
    }
}