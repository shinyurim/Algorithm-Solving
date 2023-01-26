class Solution {
    public int solution(int price) {
        if(price >= 500000) {
            price *= 0.8;
        } else if(price >= 300000) {
            price *= 0.9;
        } else if(price >= 100000) {
            price *= 0.95;
        }
        return price;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int price = 580000;
        System.out.println(sol.solution(price));
    }
}