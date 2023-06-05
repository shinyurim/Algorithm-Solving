import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int n = my_string.length();
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (int i = my_string.length() - 1;i >= 0;i--) {
            String subStr = my_string.substring(i, n);
            if (!arrayList.contains(subStr));
                arrayList.add(subStr);
        }
        
        Collections.sort(arrayList);
        
        int cnt = 0;
        String[] answer = new String[arrayList.size()];
        for (String data : arrayList)
            answer[cnt++] = data;
        return answer;
    }
}