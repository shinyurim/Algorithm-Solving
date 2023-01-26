import java.util.Arrays;

class Solution {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length(); // 배열의 길이만큼씩 담아주기
		}
		return answer;
}
	public static void main(String args[]){
		Solution sol = new Solution();
		String[] strlist = {"We", "are", "the", "world!"};
		System.out.println(Arrays.toString(sol.solution(strlist)));
	}
}