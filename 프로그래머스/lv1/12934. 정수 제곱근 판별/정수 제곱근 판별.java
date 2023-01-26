class Solution {
	public long solution(long n) {
		double a = Math.sqrt(n); // Math.sqrt : 인자로 전달된 숫자의 제곱근을 계산하여 리턴

		return a % 1 == 0 ? (long) Math.pow(a + 1, 2) : -1; // a+1 : 제곱이 될 수 , 2 : 몇 제곱을할지)

	}
	public static void main(String args[]){
		Solution sol = new Solution();
		long n = 3;
		System.out.println(sol.solution(n));

	}
}