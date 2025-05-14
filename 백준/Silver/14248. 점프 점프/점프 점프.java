import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] A = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        int s = Integer.parseInt(br.readLine());
        
        boolean[] visited = new boolean[n+1];
        Deque<Integer> queue = new ArrayDeque<>();
        visited[s] = true;
        queue.offer(s);
        int count = 1; 
        while (!queue.isEmpty()) {
            int u = queue.poll();
            int v = u + A[u];
            if (v <= n && !visited[v]) {
                visited[v] = true;
                queue.offer(v);
                count++;
            }
            v = u - A[u];
            if (v >= 1 && !visited[v]) {
                visited[v] = true;
                queue.offer(v);
                count++;
            }
        }
        System.out.println(count);
    }
}
