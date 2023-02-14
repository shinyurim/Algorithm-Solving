class Solution {
    public int solution(int[][] dots) {

        int maxX = -256;// 범위내에서 최소값으로 기본값 설정
        int maxY = -256;
        int minX = 256; // 범위내에서 최댓값으로 기본값 설정
        int minY = 256;

        for (int i = 0; i < dots.length; i++) { // dots 배열의 길이만큼 돌면서
            maxX = Math.max(maxX, dots[i][0]); // X좌표의 max값을 [i][0]에서 체크(예시로는 1 - 2 - 2 - 1 순으로 체크)
            maxY = Math.max(maxY, dots[i][1]); // Y좌표의 max값을 [i][1]에서 체크(예시로는 1 - 1 - 2 - 2 순으로 체크)
            minX = Math.min(minX, dots[i][0]); // X좌표의 min값을 [i][0]에서 체크
            minY = Math.min(minY, dots[i][1]); // Y좌표의 min값을 [i][1]에서 체크

        }
        return (maxX - minX) * (maxY - minY); // (X좌표 max값 - X좌표 min값) * (Y좌표 max값 - Y좌표 min값)
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println(sol.solution(dots));
        System.out.println(sol.solution(dots2));
    }
}