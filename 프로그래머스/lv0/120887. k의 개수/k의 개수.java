class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            String word = String.valueOf(l);
            String[] words = word.split("");
            for (int m = 0; m < word.length(); m++) {
                if (words[m].equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
       int i = 1;
       int j = 13;
       int k = 1;
        System.out.println(sol.solution(i,j,k));
    }
}