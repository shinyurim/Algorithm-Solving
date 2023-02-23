class Solution {
    public String solution(String bin1, String bin2) {

        int first = Integer.valueOf(bin1, 2); // 2진수 → 10진수 변환
        int second = Integer.valueOf(bin2, 2);

        return Integer.toBinaryString(first + second); // 10진수 → 2진수 변환 후 return
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String bin1 = "1001";
        String bin2 = "1111";
        System.out.println(sol.solution(bin1,bin2));
    }
}