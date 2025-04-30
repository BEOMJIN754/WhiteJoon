import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static void radixSort(int[] arr) {
        if (arr.length == 0) return;

        Queue<Integer>[] buckets = new Queue[10];
        for (int i = 0; i < 10; i++) buckets[i] = new LinkedList<>();

        int max = 0;
        for (int v : arr) if (v > max) max = v;

        for (int exp = 1; max / exp > 0; exp *= 10) {
            for (int v : arr) buckets[(v / exp) % 10].add(v);

            int idx = 0;
            for (int d = 0; d < 10; d++)
                while (!buckets[d].isEmpty())
                    arr[idx++] = buckets[d].poll();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] neg = new int[n];   // 절댓값 저장(음수 전용)
        int[] pos = new int[n];   // 0·양수 저장
        int nNeg = 0, nPos = 0;

        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(br.readLine().trim());
            if (v < 0) neg[nNeg++] = -v;     // 음수 → 절댓값
            else       pos[nPos++] =  v;
        }

        radixSort(neg = Arrays.copyOf(neg, nNeg)); // 음수 그룹
        radixSort(pos = Arrays.copyOf(pos, nPos)); // 0·양수 그룹

        StringBuilder sb = new StringBuilder(n * 6); 

        for (int i = nNeg - 1; i >= 0; i--)
            sb.append(-neg[i]).append('\n');

        for (int v : pos)
            sb.append(v).append('\n');

        System.out.print(sb);
    }
}