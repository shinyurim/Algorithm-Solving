class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");

        int num = 1; // +일경우 / -일경우 바뀌는 값

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")){
                num = 1;
            } else if (arr[i].equals("-")) {
                num = -1;
            }else {
                answer += num * Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String my_string = "1 + 32344 - 4434";
        System.out.println(sol.solution(my_string));
    }
}