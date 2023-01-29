class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[a,e,i,o,u]","");
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String my_string = "nice to meet you";
        System.out.println(sol.solution(my_string));
    }
}