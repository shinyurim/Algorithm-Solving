class Solution {
	public String solution(String my_string) {
		String answer = "";

		for (int i = my_string.length() - 1; i >= 0 ; i--) {
			char ch = my_string.charAt(i);
			answer += ch;
		}

		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		String my_string = "neumonoultramicroscopicsilicovolcanoconiosis";
		System.out.println(sol.solution(my_string));
	}
}