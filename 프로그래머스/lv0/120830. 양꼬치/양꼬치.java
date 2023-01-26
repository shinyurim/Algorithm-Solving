class Solution {
	public int solution(int n, int k) {
		int answer = (n * 12000) + (k * 2000) - ((n / 10) * 2000);

		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int n = 64;
		int k = 6;
		System.out.println(sol.solution(n,k));
	}
}