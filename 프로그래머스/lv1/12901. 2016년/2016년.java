// LocalDate.of(year, month, day)를 지정해준뒤, 해당 날짜의 요일을 찾아주는 .getDayOfWeek()을 사용한다.
// 반환타입이 String이기 때문에 .toString()으로 변환해준뒤 substring을 이용하여 앞의 세글자만 출력한다.(toString()까지 해서 출력했을 땐 TUESDAY처럼 풀네임이 나오기 때문 / 우리는 TUE 이런식으로 앞의 세글자만 구해야하므로)
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int a = 5;
        int b = 24;
        System.out.println(sol.solution(a,b));
    }
}