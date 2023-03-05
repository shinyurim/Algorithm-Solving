import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }

        System.out.print("<");
        while (n-- > 0){
            for (int i = 0; i < k; i++) {
                if (i == k-1){
                    if (n==0) System.out.print(queue.poll());
                    else System.out.print(queue.poll() + ", ");
                }else {
                    queue.add(queue.poll());
                }
            }
        }
        System.out.print(">");
    }
}