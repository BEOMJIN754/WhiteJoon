import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];         // 1-based index
        int[] posArr = new int[n + 1];      // 각 숫자의 위치
        int[] movementsArr = new int[n + 1]; // 각 숫자의 이동 거리

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            posArr[arr[i]] = i;
        }

        for (int i = 1; i < n; i++) {
            int move = posArr[i] - i;
            int temp = arr[i];

            swap(arr, i, posArr[i]);
            swap(posArr, i, temp);

            movementsArr[i] += Math.abs(move);
            movementsArr[temp] += Math.abs(move);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(movementsArr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
