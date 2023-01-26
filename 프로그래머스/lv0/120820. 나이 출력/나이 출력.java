class Solution {
	public int solution(int age) {
		int answer = 2022 - age + 1;
		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int age = 120;
		System.out.println(sol.solution(age));
	}
}