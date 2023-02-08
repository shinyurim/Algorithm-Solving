class Solution {
    public long solution(int price, int money, int count) {

        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }

        if (money - sum >= 0){
            return 0;
        }else {
        return (sum - money);}
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(sol.solution(price,money,count));
    }
}