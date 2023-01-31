
import java.util.Scanner;


public class Main {
    static boolean array[][];
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int M = in.nextInt();
        int count = 64;

        array = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String str = in.next();
            
            for(int j = 0; j < M; j++){
                if(str.charAt(j) == 'W'){
                    array[i][j]=true;
                }
                else array[i][j]=false;
            }
        }

        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                count = Math.min(count,fx(i,j));
            }
        }
        System.out.println(count);
    }
    public static int fx(int x,int y){
        int count1=0;
        int count2=0;
        boolean tf;
        
        for(int i = x; i < x+8; i++){
            if(i % 2 == 0){
                tf = true;
                for(int j = y; j < y+8; j++){
                    if(array[i][j]!=tf)count1++;
                    tf = (!tf);
                }
            }
            else{
                tf = false;
                for(int j = y; j < y+8; j++){
                    if(array[i][j]!=tf)count1++;
                    tf = (!tf);
                }
            }
        }
        for(int i = x; i < x+8; i++){
            if(i % 2==0){
                tf = false;
                for(int j=y; j<y+8; j++){
                    if(array[i][j]!=tf)count2++;
                    tf = (!tf);
                }
            }
            else{
                tf = true;
                for(int j = y; j < y+8; j++){
                    if(array[i][j]!=tf)count2++;
                    tf = (!tf);
                }
            }
        }
        return Math.min(count1,count2);
    }
}