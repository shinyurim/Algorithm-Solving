import java.util.Arrays;

class Solution {
	public int[] solution(int[] num_list) {

		int[] answer = new int[num_list.length]; // num_list만큼 배열크기 잡아주기

		for (int i = 0; i < num_list.length; i++) {
			int temp = num_list[i]; // 임시 변수
			answer[i] = num_list[num_list.length -i -1];
			num_list[i] = temp;
		}
		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int [] num_list = {1,0,1,1,1,3,5};
		System.out.println(Arrays.toString(sol.solution(num_list)));
	}
}