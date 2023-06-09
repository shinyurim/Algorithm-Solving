class Solution {
    public int[] solution(String myString) {
        String[] result = myString.split("x");
        int N = myString.charAt(myString.length() - 1) == 'x' ? result.length + 1 : result.length;
        int[] answer = new int[N];
        for (int i = 0;i < result.length;i++)
            answer[i] = result[i].length();
        return answer;
    }
}