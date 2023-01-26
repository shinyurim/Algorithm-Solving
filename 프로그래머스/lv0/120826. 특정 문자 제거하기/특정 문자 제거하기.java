class Solution {
	public String solution(String my_string, String letter) {
		String answer = my_string.replace(letter,"");

		return answer;
	}

	public static void main(String args[]){
		Solution sol = new Solution();

		String my_string = "BCBdbe";
		String letter = "b";

		System.out.println(sol.solution(my_string, letter));
	}
}