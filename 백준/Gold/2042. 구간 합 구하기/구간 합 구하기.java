import java.io.*;
import java.util.*;

public class Main {
    static long[] arr, tree;

    // 펜윅 트리 업데이트
    static void update(int idx, long diff, int n) {
        while (idx <= n) {
            tree[idx] += diff;
            idx += idx & -idx;
        }
    }

    // 펜윅 트리 구간 합 계산
    static long sum(int idx) {
        long result = 0;
        while (idx > 0) {
            result += tree[idx];
            idx -= idx & -idx;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new long[N + 1];
        tree = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(br.readLine());
            update(i, arr[i], N); // 초기화
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 1) { // 값 변경
                long diff = c - arr[b];
                arr[b] = c;
                update(b, diff, N);
            } else if (a == 2) { // 구간 합
                sb.append(sum((int) c) - sum(b - 1)).append("\n");
            }
        }

        System.out.print(sb);
    }
}
