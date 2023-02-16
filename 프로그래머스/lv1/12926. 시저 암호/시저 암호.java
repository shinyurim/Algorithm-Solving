import java.util.Arrays;

class Solution {
    public String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) { // 문자열의 길이만큼 돌면서
            char ch = s.charAt(i); // char ch = s의 1번째 문자열

            if (ch >= 'a' && ch <= 'z') { // a ~ z 사이면
                ch = (char) (ch + n); // 해당 문자값 + n값 옮겨주기 ** 앞에 (char) 변환 안시켜주면 숫자로 출력
                if (ch > 'z') // 만약 z보다 큰 값이 되면
                    ch -= 26; // 26빼주기
            } else if (ch >= 'A' && ch <= 'Z') { // A ~ Z 사이면
                ch = (char) (ch + n); // 해당 문자값 + n값 옮겨주기
                if (ch > 'Z') // 만약 Z보다 큰 값이 되면
                    ch -= 26; // 26빼주기
            }
            sb.append(ch); // sb에 ch더해주기
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Solution sol = new Solution();
        String s = "AB";
        int n = 1;
        String s2 = "z";
        int n2 = 1;
        String s3 = "a B z";
        int n3 = 4;

        System.out.println(sol.solution(s, n));
        System.out.println(sol.solution(s2, n2));
        System.out.println(sol.solution(s3, n3));
    }
}