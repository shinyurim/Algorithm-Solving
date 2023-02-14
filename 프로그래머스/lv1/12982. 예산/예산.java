import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d); // d 배열 정렬

        for (int i = 0; i < d.length; i++) { // 배열의 길이만큼 돌면서
            if (d[i] <= budget){ // d[i]의 값이 budget 값보다 작거나 같으면
                budget -= d[i]; // budget에서 해당값을 빼주고
                answer++; // 카운트 1 증가
            } else  {  // 아니면 budget보다 d[i]값이 크다고 판단하여 탈출
                break;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
       int[] d = {1, 3, 2, 5, 4};
       int budget = 9;
       int[] d2 = {2,2,2,3};
       int budget2 = 10;
        System.out.println(sol.solution(d, budget));
        System.out.println(sol.solution(d2, budget2));
    }
}