import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Arrays.sort(spell); // spell 배열 정렬

        String s = String.join("",spell); // join을 이용하여 문자열 합치기

        for (int i = 0; i < dic.length; i++) {
            String[] arr = dic[i].split(""); // dic 배열 자르기
            Arrays.sort(arr); // dic 배열 정렬
            String s1 = String.join("",arr); // join을 이용하여 문자열 합치기
            if (s.equals(s1)){ // 만약 s가 s1과 같으면
                answer = 1; // answer = 1
                break; // 나가기
            }else { // 아니라면
                answer = 2; // answer = 2
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        String[] spell3 = {"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println(sol.solution(spell,dic));
        System.out.println(sol.solution(spell2,dic2));
        System.out.println(sol.solution(spell3,dic3));
    }
}