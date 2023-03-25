class Solution {
    public int solution(String A, String B) {
        int cnt = 0;

        String str = A; // 문자열을 따로 저장할 result 생성

        for (int i = 0; i < A.length(); i++) {
            if (str.equals(B)) { // A와 B의 값이 같으면 밀어야 하는 최소횟수는 0이므로
                return cnt;
            }
            String a = str.substring(str.length() - 1); // 마지막 문자를 가져와 저장
            str = a + str.substring(0, str.length() - 1);
            cnt++; // cnt 카운트 증가
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String A = "hello";
        String B = "ohell";
        String A2 = "apple";
        String B2 = "elppa";
        String A3 = "atat";
        String B3 = "tata";
        String A4 = "abc";
        String B4 = "abc";
        System.out.println(sol.solution(A, B));
        System.out.println(sol.solution(A2, B2));
        System.out.println(sol.solution(A3, B3));
        System.out.println(sol.solution(A4, B4));
    }
}