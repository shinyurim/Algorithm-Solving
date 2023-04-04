class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) { // nums 배열에서 3개의 숫자를 선택하여 더한 값이 소수인 경우의 개수를 구하는 for문
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                         if (isPrime(sum) == true) { // 만약 해당값이 소수라면
                                answer++; // answer의 카운트 증가
                            }
                      }
                   }
              }
               return answer;
          }

    private boolean isPrime(int num) { // 소수를 판별하기 위한 함수
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) { // 2부터 제곱근까지의 수 중 나누어 떨어지는 수가 있는 확인하는 for문
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(sol.solution(nums));
    }
}