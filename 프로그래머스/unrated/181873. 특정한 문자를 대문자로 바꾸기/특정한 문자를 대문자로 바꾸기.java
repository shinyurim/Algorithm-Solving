class Solution {
    public String solution(String my_string, String alp) {
        if (my_string.contains(alp)) {
            my_string = my_string.replace(alp, Character.toString((char)(alp.charAt(0) - ('a' - 'A'))));
        }
        return my_string;
    }
}