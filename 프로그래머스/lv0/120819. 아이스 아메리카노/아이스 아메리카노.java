import java.util.Arrays;

class Solution {
	public int[] solution(int money) {

		int[] answer = new int[2];

		int americano = 5500; // 아메리카노의 가격

		answer[0] = money / americano; // 마실 수 있는 아메리카노 잔 수
		answer[1] = money % americano; // 남는 돈

		return answer;
	}
	public static void main(String args[]){
		Solution sol = new Solution();
		int money = 15000;
		System.out.println(Arrays.toString(sol.solution(money)));

	}
}