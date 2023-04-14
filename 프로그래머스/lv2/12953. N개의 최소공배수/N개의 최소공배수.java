class Solution {
    public static int solution(int[] arr) {
        int answer = arr[0];

        for (int j : arr) {
            answer = lcm(answer, j);
        }
        return answer;
    }
     
    public static int gcd(int a, int b) { // 최대공약수
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int lcm(int a, int b) {  // 최소공배수
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 6, 8, 14};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {12, 32, 45, 67, 72};
        int[] arr4 = {13, 26};
        int[] arr5 = {17, 34};
        int[] arr6 = {3, 4, 9, 16};
        int[] arr7 = {2, 3, 4};
        int[] arr8 = {14, 2, 7};
        System.out.println(sol.solution(arr));
        System.out.println(sol.solution(arr2));
        System.out.println(sol.solution(arr3));
        System.out.println(sol.solution(arr4));
        System.out.println(sol.solution(arr5));
        System.out.println(sol.solution(arr6));
        System.out.println(sol.solution(arr7));
        System.out.println(sol.solution(arr8));
    }
}