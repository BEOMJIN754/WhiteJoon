import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] minTree, maxTree, arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int size = 1;
        while (size < n) size *= 2;
        size *= 2; 

        minTree = new int[size];
        maxTree = new int[size];

        buildTree(1, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1; 
            int b = Integer.parseInt(st.nextToken()) - 1;

            int minVal = queryMin(1, 0, n - 1, a, b);
            int maxVal = queryMax(1, 0, n - 1, a, b);

            sb.append(minVal).append(" ").append(maxVal).append("\n");
        }

        System.out.print(sb);
    }

    private static void buildTree(int node, int start, int end) {
        if (start == end) {
            minTree[node] = arr[start];
            maxTree[node] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        buildTree(node * 2, start, mid);
        buildTree(node * 2 + 1, mid + 1, end);
        minTree[node] = Math.min(minTree[node * 2], minTree[node * 2 + 1]);
        maxTree[node] = Math.max(maxTree[node * 2], maxTree[node * 2 + 1]);
    }
    private static int queryMin(int node, int start, int end, int left, int right) {
        if (left > end || right < start) return Integer.MAX_VALUE;
        if (left <= start && end <= right) return minTree[node];

        int mid = (start + end) / 2;
        return Math.min(queryMin(node * 2, start, mid, left, right),
                        queryMin(node * 2 + 1, mid + 1, end, left, right));
    }

    private static int queryMax(int node, int start, int end, int left, int right) {
        if (left > end || right < start) return Integer.MIN_VALUE;
        if (left <= start && end <= right) return maxTree[node];

        int mid = (start + end) / 2;
        return Math.max(queryMax(node * 2, start, mid, left, right),
                        queryMax(node * 2 + 1, mid + 1, end, left, right));
    }
}
