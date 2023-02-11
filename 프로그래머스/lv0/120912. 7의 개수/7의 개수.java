class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) { 
            sb.append(array[i]);
        }

        char[] ch = sb.toString().toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '7'){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] array = {7,77,17};
        int[] array2 = {10,29};
        System.out.println(sol.solution(array));
        System.out.println(sol.solution(array2));
    }
}