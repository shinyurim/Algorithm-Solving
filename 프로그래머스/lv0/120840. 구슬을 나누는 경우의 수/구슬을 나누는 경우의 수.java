class Solution {
    public int solution(int balls, int share) {
        int count = 0;
        
        if (share > balls) { // 나누어 줄 구슬 개수가 구슬 개수보다 많은 경우
            return 0;
        }
        
        if (share == 1) { // 나누어 줄 구슬 개수가 1인 경우
            return balls;
        }
        
        for (int i = 1; i <= balls; i++) { // 재귀 이용
            count += solution(balls-i, share-1);
        }
        return count;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int balls = 3;
        int share = 2;
        int balls2 = 5;
        int share2 = 3;
        System.out.println(sol.solution(balls,share));
        System.out.println(sol.solution(balls2,share2));
    }
}