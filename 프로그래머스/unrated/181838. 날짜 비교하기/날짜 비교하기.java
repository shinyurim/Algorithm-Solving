class Solution {
    public int solution(int[] date1, int[] date2) {
        int date1Days = getTotalDays(date1);
        int date2Days = getTotalDays(date2);
        
        return date1Days < date2Days ? 1 : 0;
    }
    
    public int getTotalDays(int[] date) {
        int result = 0;
        result += date[0] * 360;
        result += date[1] * 30;
        result += date[2];
        return result;
    }
}