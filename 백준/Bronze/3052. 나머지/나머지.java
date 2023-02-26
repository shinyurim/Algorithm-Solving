import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();


        for (int i = 0; i < 10; i++) { // 10개의 수가 주어진다
            set.add(Integer.parseInt(br.readLine())%42);
        }
        br.close();
        System.out.println(set.size());
    }
}