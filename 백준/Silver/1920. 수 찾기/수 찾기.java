import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);

        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            int maxIndex = list.length-1;
            int minIndex = 0;
            int middleIndex;


            while (true) {
                if (minIndex > maxIndex) {
                    bw.append("0\n");
                    break;
                }

                middleIndex = (maxIndex + minIndex) / 2;

                if (list[middleIndex] == arr[i]) {
                    bw.append("1\n");
                    break;
                }

                if (list[middleIndex] < arr[i]) {
                    minIndex = middleIndex+1;
                } else if (list[middleIndex] > arr[i]) {
                    maxIndex = middleIndex-1;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}

