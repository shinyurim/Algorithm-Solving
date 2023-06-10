import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while (n >= 1) {
            arrayList.add(n);
            
            if (n == 1) break;
            
            if (n % 2 == 0)
                n = n / 2;
            else 
                n = 3 * n + 1;
        }
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}