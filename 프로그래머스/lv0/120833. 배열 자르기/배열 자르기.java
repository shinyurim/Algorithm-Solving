import java.util.Arrays;

class Solution {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int[] numbers = {1,3,5};
		int num1 = 1;
		int num2 = 2;
		System.out.println(Arrays.toString(sol.solution(numbers, num1, num2)));
	}
}