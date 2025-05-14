import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] mn = br.readLine().split(" ");
        int M = Integer.parseInt(mn[0]);
        int N = Integer.parseInt(mn[1]);

        int[][] box = new int[N][M];
        Deque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(parts[j]);
                if (box[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0], c = cur[1];
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d], nc = c + dc[d];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (box[nr][nc] != 0) continue;
                box[nr][nc] = box[r][c] + 1;
                queue.offer(new int[]{nr, nc});
            }
        }

        int maxDay = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                maxDay = Math.max(maxDay, box[i][j]);
            }
        }

        System.out.println(maxDay > 1 ? maxDay - 1 : 0);
    }
}
