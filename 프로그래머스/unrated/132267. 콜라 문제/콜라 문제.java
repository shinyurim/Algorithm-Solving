class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (a <= n){ // 보유중인 병이 a병 미만이면, 추가적으로 빈병을 받을수 X
            answer += (n / a) * b; // answer에 (빈병 갯수 / 콜라 교환에 필요한 빈병 갯수) * (마트가 주는 콜라병 갯수)
            n = (n % a) + (n / a) * b; // [갱신해주기] 빈병 갯수 = (빈병 갯수를 콜라 교환에 필요한 빈병 갯수로 나눈 나머지) + (빈병 갯수 / 콜라 교환에 필요한 빈병 갯수) * (마트가 주는 콜라병 갯수)
        }
        return answer;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int a = 2;
        int b = 1;
        int n = 20;
        int a2 = 3;
        int b2 = 1;
        int n2 = 20;
        System.out.println(sol.solution(a,b,n));
        System.out.println(sol.solution(a2,b2,n2));

    }
}