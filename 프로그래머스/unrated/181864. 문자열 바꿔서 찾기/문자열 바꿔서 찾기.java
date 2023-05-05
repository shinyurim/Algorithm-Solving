import java.util.Arrays;

class Solution {
    public int solution(String myString, String pat) {

        String[] str = myString.split("");
        String[] str2 = new String[str.length];
        String str3 = "";

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("A")){
                str2[i] = "B";
            }else {
                str2[i] = "A";
            }
        }

        for (String s : str2) {
            str3 += s;
        }

        if (str3.contains(pat)){
            return 1;
        }else {
            return 0;
        }
    }
}