class Solution {
    public int solution(int order) {
       String answer =  Integer.toString(order); // int를 String으로 형변환
       
       int cnt = 0; // 카운트 수
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == '3' || answer.charAt(i) == '6' || answer.charAt(i) == '9'){ // 3이거나, 6이거나, 9일때
                cnt++; // 카운트 증가
            }
        }
        return cnt;
    }
    
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 3;
        int n2 = 29423;
        System.out.println(sol.solution(n));
        System.out.println(sol.solution(n2));
    }
}