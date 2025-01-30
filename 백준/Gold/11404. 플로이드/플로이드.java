import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 100000000; // 충분히 큰 값 (무한대 대체)

    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄: 도시 개수 n
        int n = Integer.parseInt(br.readLine());
        // 두 번째 줄: 버스 개수 m
        int m = Integer.parseInt(br.readLine());

        // 거리 행렬 초기화
        int[][] distance = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) distance[i][j] = 0; // 자기 자신으로 가는 비용 = 0
                else distance[i][j] = INF; // 나머지는 무한대로 초기화
            }
        }

        // 간선 정보 입력
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 시작 도시
            int b = Integer.parseInt(st.nextToken()); // 도착 도시
            int c = Integer.parseInt(st.nextToken()); // 비용

            // 같은 노선이 여러 개일 수 있으므로 최소 비용만 저장
            distance[a][b] = Math.min(distance[a][b], c);
        }

        // 플로이드-워셜 알고리즘 실행
        for (int k = 1; k <= n; k++) { // 경유 도시
            for (int i = 1; i <= n; i++) { // 출발 도시
                for (int j = 1; j <= n; j++) { // 도착 도시
                    if (distance[i][k] != INF && distance[k][j] != INF) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                    }
                }
            }
        }

        // 결과 출력 (BufferedWriter 사용)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (distance[i][j] == INF) bw.write("0 ");
                else bw.write(distance[i][j] + " ");
            }
            bw.write("\n");
        }

        // 버퍼 비우고 닫기
        bw.flush();
        bw.close();
        br.close();
    }
}
