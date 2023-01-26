import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String [] arr = Long.toString(n).split(""); // 정수 -> 문자열 변환 + 배열로 만들기
        Arrays.sort(arr, Comparator.reverseOrder()); // 내림차순정렬
        String result = Arrays.stream(arr).collect(Collectors.joining());
        return Long.parseLong(result);
    }
}