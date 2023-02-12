class Solution {
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int index = 0; // 인덱스를 구별할 변수

        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")) {
                index = 0;
            } else {
                if(index % 2 == 0) {
                    str[i] = str[i].toUpperCase();
                    index ++;
                } else {
                    str[i] = str[i].toLowerCase();
                    index ++;
                }
            }
            answer += str[i];
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
       String s = "try hello world";

        System.out.println(sol.solution(s));
    }
}