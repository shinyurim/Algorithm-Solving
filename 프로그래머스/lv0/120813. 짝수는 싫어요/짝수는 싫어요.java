import java.util.Arrays;

class Solution {
	public int[] solution(int n) {
		int tmp = (n + 1)/2;
		int[] answer = new int[tmp];

		for (int i = 1; i <= n ; i++) {
			if (i % 2 == 1){
				answer[i / 2] = i;
			}
		}
		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int n = 100;
		System.out.println(Arrays.toString(sol.solution(n)));
	}
}