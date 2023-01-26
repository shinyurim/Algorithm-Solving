class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0; // 자릿수의 합을 구할 변수
        int a = x;
        while (x != 0){
            sum += x % 10; // 10으로 나눈 나머지 -> 1의 자리 구하기 (ex. 1234일  경우 1234을 10으로 나눈 나머지는 1)
            x /= 10;// 10으로 나눠줌으로써 원래의 1의자리는 사라지고, 새로운 1의 자리가 생긴다.(ex. 1234 -> 123으로 바뀌고, 123을 10으로 나눈 나머지는 3)
        }
        if (a % sum == 0) return answer;// 정수를 자릿수의합으로 나눈 나머지가 없으면 하샤드 수
        return false; // 하샤드 수가 아닐 시 false로 return
        }
}