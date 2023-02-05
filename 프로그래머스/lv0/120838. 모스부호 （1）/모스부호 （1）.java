class Solution {
    public String solution(String letter) {
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArray = letter.split(" ");

        StringBuilder answer = new StringBuilder();

        for (String s : letterArray) {
            for (int j = 0; j < morse.length; j++) {
                if (s.equals(morse[j])) {
                    answer.append((char) (j + 97));
                }
            }
        }
        return answer.toString();
    }
    public static void main(String[] args){
        Solution sol = new Solution();
       String letter = ".--. -.-- - .... --- -.";
        System.out.println(sol.solution(letter));
    }
}