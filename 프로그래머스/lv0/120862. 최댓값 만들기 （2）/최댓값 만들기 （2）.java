class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) { 
            for (int j = i + 1; j < numbers.length; j++) {

                if (answer < numbers[i] * numbers[j]){ 
                   answer = numbers[i] * numbers[j]; 
                }
            }
        }
        return answer; 
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] numbers = {1, 2, -3, 4, -5};
        int[] numbers2 = {0, -31, 24, 10, 1, 9};
        int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};

        System.out.println(sol.solution(numbers));
        System.out.println(sol.solution(numbers2));
        System.out.println(sol.solution(numbers3));
    }
}