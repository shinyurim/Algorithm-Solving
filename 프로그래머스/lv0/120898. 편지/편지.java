class Solution {
	public int solution(String message) {
		int answer = message.length() * 2;
		return answer;
	}

	public static void main(String args[]){
		Solution sol = new Solution();
		String message = "I Love you~";
		System.out.println(sol.solution(message));
	}
}