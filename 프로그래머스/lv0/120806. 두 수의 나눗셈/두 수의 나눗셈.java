class Solution {
	public int solution(int num1, int num2) {
		int answer = (num1 * 1000) / num2;


		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int num1 = 1;
		int num2 = 16;
		System.out.println(sol.solution(num1,num2));
	}
}