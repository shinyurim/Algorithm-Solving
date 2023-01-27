class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");

        for (int i = 0; i < str.length ; i++) {
            if ((i + 1) % code == 0){ // code로 나눈 나머지가 0이면 code의 배수니까
                answer += str[i];
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String cipher = "pfqallllabwaoclk";
        int code = 2;
        System.out.println(sol.solution(cipher,code));
    }
}