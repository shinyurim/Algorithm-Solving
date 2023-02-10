class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

             return answer = (int) Math.floor((n - 1) / slice + 1); // 소수점을 올려주는 floor 사용

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int slice2 = 4;
        int n2 = 12;
        System.out.println(sol.solution(slice,n));
        System.out.println(sol.solution(slice2,n2));
    }
}