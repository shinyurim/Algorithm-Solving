class Solution {
    public int solution(int[] box, int n) {
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;
        return width * length * height;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] box = {1,1,1};
        int n = 1;
        int[] box2 = {10,8,6};
        int n2 = 3;

        System.out.println(sol.solution(box,n));
        System.out.println(sol.solution(box2,n2));
    }
}