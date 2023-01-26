class Solution {
	public int solution(int n) {
		int answer = 0;
		int a = n / 7;
		int b = n % 7;

		if (b == 0){
			answer = a * 1;
		} else if (b != 0) {
			answer = a * 1 + 1;
		}

		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int n = 15;
		System.out.println(sol.solution(n));
	}
}