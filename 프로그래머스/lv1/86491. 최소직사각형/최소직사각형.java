class Solution {
    public int solution(int[][] sizes) {
        int width = 0, height = 0; // 가로, 세로 변수 설정

        // forEach문을 통해 배열을 하나씩 꺼내면서 큰 값과 작은 값을 구별 → 이후 width값, heigtth값과 비교하여 더 큰 값으로 재 설정
        for(int[] card : sizes) {
            width = Math.max(width, Math.max(card[0], card[1])); // 가로
            height = Math.max(height, Math.min(card[0], card[1])); // 세로
        }

        return width * height; // 가로 * 세로 값 return
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int [][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(sol.solution(size));
    }
}