import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int a = 100000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == j)
					arr[i][j] = 0;
				else
					arr[i][j] = a;
			}
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			arr[a][b] = Math.min(arr[a][b], c);
		}

		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(arr[i][j]>(arr[i][k]+arr[k][j])) {
						arr[i][j] = arr[i][k]+arr[k][j];
					}
					
				}
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(arr[i][j]==a)bw.write("0 ");
				else bw.write(arr[i][j]+" ");
			}
		bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
