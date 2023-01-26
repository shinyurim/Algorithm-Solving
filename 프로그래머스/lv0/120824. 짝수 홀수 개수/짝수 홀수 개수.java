import java.util.Arrays;

class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0){
				answer[0]++;
			}else {
				answer[1]++;
			}
		}
		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int[] answer = {1,3,5,7};
		System.out.println(Arrays.toString(sol.solution(answer)));
	}
}