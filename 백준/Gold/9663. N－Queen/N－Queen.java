import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    static int N, cnt, chess[];
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        chess = new int[N];
 
        dfs(0);
        System.out.println(cnt);
    }
 
    private static void dfs(int cur) {
        if (cur == N) {
            cnt++;
            return;
        }
 
        for (int i = 0; i < N; i++) {
            chess[cur] = i;
            if (isOk(cur)) {
                dfs(cur + 1);
            }
        }
    }
 
    private static boolean isOk(int col) {
        for (int i = 0; i < col; i++) {
            if (chess[col] == chess[i])
                return false;
 
            if (col - i == Math.abs(chess[col] - chess[i]))
                return false;
        }
 
        return true;
    }
}