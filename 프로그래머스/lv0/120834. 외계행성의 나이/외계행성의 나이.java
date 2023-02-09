class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        while (age != 0){ // age가 0이 아닐동안
            sb.insert(0,(char)(age%10 + 97)); // 0부터 시작해서 저장
            age /= 10;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
       int age = 23;
        System.out.println(sol.solution(age));
    }
}