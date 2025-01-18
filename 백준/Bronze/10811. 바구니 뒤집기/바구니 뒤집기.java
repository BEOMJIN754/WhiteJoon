import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		
		for(int i=1;i<=m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			while(a<b) {
				int temp=arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				a++;
				b--;
				
			}
		}
		for(int i=1;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
}
