class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] str = control.split("");

        for (String s : str) {
            switch (s) {
                case "w":
                    answer += 1;
                    break;
                case "s":
                    answer -= 1;
                    break;
                case "d":
                    answer += 10;
                    break;
                default:
                    answer -= 10;
                    break;
            }
        }
        return answer;
    }
}