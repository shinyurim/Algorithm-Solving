import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int[] answer = new int[2]; // [분자, 분모]

        answer[0] = (denom2 * numer1 + denom1 * numer2); // 분모를 같게 만드는데 사용하는 값을 분자에도 곱해줘야함
        answer[1] = (denom1 * denom2); // 분모를 같게 만들기 위해 각 분모의 값을 곱한다

        int min = Math.min(answer[0], answer[1]);
        int gcd = 1; // 최대공약수 구하기를 구하기 위한 변수

        for (int i = 1; i <= min; i++) {
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                gcd = i;
            }
        }

        answer[0] = answer[0] / gcd;
        answer[1] = answer[1] / gcd;

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        System.out.println(Arrays.toString(sol.solution(numer1, denom1, numer2, denom2)));
    }
}