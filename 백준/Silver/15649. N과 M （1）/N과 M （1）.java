import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] check = new boolean[8];
    public static int[] array = new int[8];
    public static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int i = 0 ; i < M ; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i < N ; i++) {
            if(check[i] == false) {
                check[i] = true;
                array[depth] = i+1;
                dfs(N, M, depth+1);
                check[i] = false;
            }
        }
        return;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        dfs(N, M, 0);
    }
}