class Solution {
    public int solution(long num) {
        int answer = 0; // 작업 반복 횟수

        while(answer < 500){
            if (num == 1) {
                return 0;
            } else if (num % 2 == 0){// 짝수이면
                num /= 2;
                answer++;
            }else { // 홀수이면
                num = (num*3)+1;
                answer++;
            }
            if (num == 1) break;
        }
        if (num != 0 && num != 1) answer = -1;
        return answer;
    }
}