class Solution {
    public String solution(String rsp) {
        
        StringBuilder answer = new StringBuilder();
        String [] tmp = rsp.split("");

        for (int i = 0; i < rsp.length(); i++) {
            
            if(tmp[i].equals("2")){
                answer.append("0");
            }else if (tmp[i].equals("0")) {
                  answer.append("5");
            }else answer.append("2");
        }
     
        return answer.toString();
        
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        String rsp = "205";
        System.out.println(sol.solution(rsp));
    }
}