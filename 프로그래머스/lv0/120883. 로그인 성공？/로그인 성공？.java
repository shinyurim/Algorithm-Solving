class Solution {
    public String solution(String[] id_pw, String[][] db) {

        for (int i = 0; i < db.length ; i++) { // db배열의 길이만큼 돌면서
            if (id_pw[0].equals(db[i][0])){ // id가 db[i][0]와 같고
                if (id_pw[1].equals(db[i][1])){ // pw가 db[i][1] 와 같으면
                    return "login"; // login 출력
                }
                return "wrong pw"; // 아이디는 있지만 비밀번호가 맞지 않다면 wrong pw 출력
            }
        }
        return "fail"; // 둘다 안맞으면 fail 출력
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        System.out.println(sol.solution(id_pw,db));
    }
}