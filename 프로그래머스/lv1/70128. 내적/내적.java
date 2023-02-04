class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int[] a2 = {-1,0,1};
        int[] b2 = {1,0,-1};
        System.out.println(sol.solution(a,b));
        System.out.println(sol.solution(a2,b2));
    }
}