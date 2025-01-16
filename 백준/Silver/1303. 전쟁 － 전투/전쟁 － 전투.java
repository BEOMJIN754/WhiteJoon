import java.util.*;

public class Main {
    static int n, m; 
    static char[][] battlefield; 
    static boolean[][] visited; 
    static int[] dx = {-1, 1, 0, 0}; 
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); 

        battlefield = new char[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            battlefield[i] = sc.nextLine().toCharArray();
        }

        int whitePower = 0;
        int bluePower = 0;

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (!visited[y][x]) {
                    char team = battlefield[y][x];
                    int groupSize = bfs(x, y, team); 
                    int power = groupSize * groupSize; 
                    if (team == 'W') {
                        whitePower += power;
                    } else if (team == 'B') {
                        bluePower += power;
                    }
                }
            }
        }

        System.out.println(whitePower + " " + bluePower);
    }

    static int bfs(int startX, int startY, char team) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startY][startX] = true;

        int size = 1; 

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m 
                    && !visited[ny][nx] && battlefield[ny][nx] == team) {
                    visited[ny][nx] = true;
                    queue.offer(new int[]{nx, ny});
                    size++;
                }
            }
        }

        return size; 
    }
}
