public class Main {
    public static void main(String args[]){

        boolean [] nonSelf = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int n = notSelfNum(i);
            if (n <= 10000) nonSelf[n] = true;
            
            }
        for (int j = 1; j <= 10000; j++) {
            if (!nonSelf[j]) System.out.println(j);
        }
    }
    public static int notSelfNum(int a){
        int sum = a;

        while (a != 0){
            sum = sum + (a % 10);
            a = a / 10;
        }
        return sum;
    }
}