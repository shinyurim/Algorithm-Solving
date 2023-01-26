class Solution {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)){
            return 1;
        }else return 2;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String str1 = "ppprrrogrammers";
        String str2 = "pppp";
        System.out.println(sol.solution(str1,str2));
    }
}