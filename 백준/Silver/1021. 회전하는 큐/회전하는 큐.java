import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] target = new int[t];
		for(int i=0;i<t;i++) {
			target[i] = Integer.parseInt(st.nextToken());
		}
		
		Deque<Integer> dq = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			dq.addLast(i);
		}
		
		int cnt =0;
		
		for(int i=0;i<target.length;i++) {
			int m = target[i];
			int idx = ((LinkedList<Integer>) dq).indexOf(m);
			
			if(idx <= dq.size()/2) {
				for(int j=0;j<idx;j++) {
					dq.addLast(dq.pollFirst());
					cnt++;
				}
			}
			else{
				for(int j=0;j<dq.size()-idx;j++) {
					dq.addFirst(dq.pollLast());
					cnt++;
				}
			}
			dq.pollFirst();
		}
		
		System.out.println(cnt);
	}
}
