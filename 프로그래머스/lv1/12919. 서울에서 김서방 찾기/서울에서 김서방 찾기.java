import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int a = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 " + a + "에 있다";
      }
    }