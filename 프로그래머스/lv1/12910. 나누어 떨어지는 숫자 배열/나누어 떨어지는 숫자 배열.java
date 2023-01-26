import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

	public int[] solution(int[] arr, int divisor) {
		Arrays.sort(arr);
		int[] answer = {};
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		answer = new int[list.size()];
		if (list.size() == 0) {
			return new int[]{-1};
		} else {
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		return answer;
	}

	public static void main(String args[]) {
		Solution sol = new Solution();
		int[] arr = {3,2,6};
		int divisor = 10;
		System.out.println(Arrays.toString(sol.solution(arr, divisor)));

	}
}