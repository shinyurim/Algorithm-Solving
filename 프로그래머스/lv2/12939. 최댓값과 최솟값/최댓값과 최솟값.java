import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split(" "); // 쪼개기
        
        int[] nums = new int[array.length]; 
        for (int i = 0; i < array.length; i++) { 
             nums[i] = Integer.parseInt(array[i]); // int형으로 변환
        }
        Arrays.sort(nums); // 정렬

        answer = nums[0] + " " + nums[nums.length - 1]; // 0번째인덱스 값 + " " + 마지막 인덱스 값
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "1 2 3 4";
        String s2 = "-1 -2 -3 -4";
        String s3 = "-1 -1";
        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
    }
}