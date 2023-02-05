class Solution {
    public int solution(int num, int k) {
        String num2 = Integer.toString(num);

        for (int i = 0; i < num2.length(); i++) {
            if (num2.charAt(i) - '0' == k){
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int num = 123456;
        int k = 7;
        System.out.println(sol.solution(num,k));
    }
}