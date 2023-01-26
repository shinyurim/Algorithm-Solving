import java.util.Arrays;

class Solution {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		
		int answer = numbers[numbers.length - 1] * numbers[numbers.length -2];

		return answer;
	}

	public static void main(String args[]){
		Solution sol = new Solution();
		int[] numbers = {0,31,24,10,1,9};
		System.out.println(sol.solution(numbers));
	}
}