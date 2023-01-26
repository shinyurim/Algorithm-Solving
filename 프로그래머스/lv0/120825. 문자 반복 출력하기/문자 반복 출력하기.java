class Solution {
	public String solution(String my_string, int n) {
		String[] tmp = my_string.split(""); // split을 이용해서 한글자씩 tmp 배열에 담아주기
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) { // 이중 for문 이용
			for (int j = 0; j < n; j++) {
				answer += tmp[i];
			}
		}
		return answer;
	}
	
	public static void main(String args[]){
		Solution sol = new Solution();
		String my_String = "hello";
		int n = 3;
		System.out.println(sol.solution(my_String,n));
	}
}