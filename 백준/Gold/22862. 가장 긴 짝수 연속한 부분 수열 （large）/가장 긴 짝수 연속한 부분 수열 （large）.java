import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int length = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		int[] arr = new int[length];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<length;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int p1 = 0;
		int p2 = 0;
		int cnt =0;
		int ans = 0;
		
		while(true) {
			if(cnt >num) {
				if(arr[p1]%2==1)cnt -=1;
				p1 +=1;
			}else if (p2==length) break;
			else {
				if(arr[p2]%2==1) {
					cnt +=1;
				}p2 +=1;
			}
			if(cnt<=num) {
				ans = Math.max(ans, p2-p1-cnt);
			}
		}
		System.out.println(ans);
	}
}
