class Solution {
    public int solution(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
       int[] numbers = {1,2,3,4};
       int k = 2;
       int[] numbers2 = {1,2,3,4,5,6};
       int k2 = 5;
       int[] numbers3 = {1,2,3};
       int k3 = 3;

        System.out.println(sol.solution(numbers,k));
        System.out.println(sol.solution(numbers2,k2));
        System.out.println(sol.solution(numbers3,k3));
    }
}