import java.util.Arrays;

class Solution {
	public int solution(int[] sides) {
		int answer = 0;
		Arrays.sort(sides);

		if (sides[0] + sides[1] > sides[2]){
			answer = 1;
		}else {
			answer = 2;
		}
		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int[] sides = {199,72,222};
		System.out.println(sol.solution(sides));
	}
}