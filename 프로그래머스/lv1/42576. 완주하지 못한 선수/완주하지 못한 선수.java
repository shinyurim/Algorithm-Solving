import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {

        Arrays.sort(participant); // 오름차순 정렬
        Arrays.sort(completion); // 오름차순 정렬

        for (int i = 0; i < completion.length; i++) { // for문을 돌면서
            if (!completion[i].equals(participant[i])) { // 각 인덱스의 값이 같지 않으면
                return participant[i]; // 완주하지 못했다고 판단
            }
        }
        return participant[participant.length - 1];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        System.out.println(sol.solution(participant, completion));
        System.out.println(sol.solution(participant2, completion2));
        System.out.println(sol.solution(participant3, completion3));
    }
}