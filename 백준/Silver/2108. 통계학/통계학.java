import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		int mid = 0; 
		int[] max_arr = new int[8001]; 
		int max = -4000, min = 4000; 
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			sum += arr[i];

			max_arr[arr[i] + 4000]++;
			

			if(N == 1) {
				max = 0;
				min = 0;
			}else {
				if(max < arr[i]) {
					max = arr[i];
				}
				if(min > arr[i]) {
					min = arr[i];
				}
			}			
		}

		Arrays.sort(arr);
		mid = arr[N/2];
		
		int max_cnt = 0;
		int result = 0;
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt < max_arr[i]) {
				max_cnt = max_arr[i];
				result = i - 4000;
			}
		}
		int cnt = 0;
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt == max_arr[i]) {
				result = i - 4000;
				if(cnt == 1) {
					break;
				}
				cnt++;
			}
		}
		
		System.out.println((int)Math.round((double)sum/N)); 
		System.out.println(mid); 
		System.out.println(result); 
		System.out.println(max - min); 
		br.close();
	}
	
}