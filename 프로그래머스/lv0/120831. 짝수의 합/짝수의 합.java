class Solution {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0){
				answer += i;
			}else {
				answer = answer;
			}
		}
		return answer;
	}

	public static void main(String args[]){
		Solution sol = new Solution();
		int n = 10;
		System.out.println(sol.solution(n));
	}
}