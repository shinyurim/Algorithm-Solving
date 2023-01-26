class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();

        int a = 0;
        int b = 0;
        for (int i = 0; i <s.length() ; i++) { // s사이즈 만큼 돌면서

          if (s.charAt(i) == 'P'){
              a++;
            } else if (s.charAt(i) == 'Y') {
              b++;
          }
        }
        if (a != b) {
            answer = false;
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String s = "pyY";
        System.out.println(sol.solution(s));
    }
}