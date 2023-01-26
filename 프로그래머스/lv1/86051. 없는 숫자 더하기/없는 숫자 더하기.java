
class Solution {
    public int solution(int[] numbers) {
        int num = 45;
        for (int i : numbers) {
            num -= i;
        }
        return num;
    }
}