import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static List<Integer>[] graph;
	static boolean[] visited;
	static int count =0;
	
	public static void dfs(int node) {
		visited[node] = true;
		for(int neighbor : graph[node]) {
			if(!visited[neighbor]) {
				count++;
				dfs(neighbor);
			}
		}
	}
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		graph = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i =1;i<=n;i++) {
			graph[i] = new ArrayList<>();
		}
		
		for(int i=0;i<m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a].add(b);
			graph[b].add(a);
		}
		dfs(1);
		System.out.println(count);
	}

}
