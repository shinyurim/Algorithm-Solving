import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
       my_string =  my_string.toLowerCase(); // 전체 소문자로 변경
        String[] array = my_string.split(""); // 쪼개기
        Arrays.sort(array); // 정렬
        return String.join("",array); // 붙이기
    }
    public static void main(String args[]){
        Solution sol = new Solution();
       String my_string = "Pyhton";
        System.out.println(sol.solution(my_string));
    }
}