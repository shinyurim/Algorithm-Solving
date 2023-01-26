class Solution {
	public int solution(int num1, int num2) {
		int answer = 0;

		if (num1 == num2) answer = 1;
		if (num1 != num2) answer = -1;
		return answer;
	}
	public static void main(String args[]){

		Solution sol = new Solution();
		int num1 = 11;
		int num2 = 11;

		System.out.println(sol.solution(num1,num2));
	}
}