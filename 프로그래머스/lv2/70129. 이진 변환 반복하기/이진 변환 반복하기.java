import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int zeroCnt = 0; // 0의 갯수를 셀 변수
        int cnCnt = 0; // 이진변환의 횟수

        while (s.length() > 1){ // s가 1이될때까지 반복해서 이진변환을 한다고 했기때문에 1이상일때 계속 돌게 만듬
            int tmp = s.length(); // 최초 s의 길이
            s = s.replace("0",""); // 0을 ""로 변환
            zeroCnt += tmp - s.length(); // 수정했을때의 s의 길이
            s = Integer.toBinaryString(s.length()); // s의 길이를 이진법으로 바꿈(toBinaryString)
            cnCnt++; // 이진 변환의 횟수 +1
        }
        int[] answer = {cnCnt, zeroCnt};
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
       String s = "110010101001";
       String s2 = "01110";
       String s3 = "1111111";

        System.out.println(Arrays.toString(sol.solution(s)));
        System.out.println(Arrays.toString(sol.solution(s2)));
        System.out.println(Arrays.toString(sol.solution(s3)));
    }
}