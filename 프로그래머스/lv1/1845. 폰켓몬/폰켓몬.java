import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() < nums.length / 2) {
            return map.size();
        } else {
            return nums.length / 2;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(sol.solution(nums));
        System.out.println(sol.solution(nums2));
        System.out.println(sol.solution(nums3));
    }
}