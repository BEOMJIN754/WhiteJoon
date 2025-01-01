import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int m = 0; // 최소 길이를 저장할 변수

        // 슬라이딩 윈도우 기법
        while (end < N) {
            // sum을 end 위치까지 확장
            sum += arr[end++];

            // sum이 S 이상이 되면, start를 증가시키며 최소 길이를 갱신
            while (sum >= S) {
                if (m == 0 || end - start < m) { // 처음 갱신하거나 더 작은 구간을 찾았을 때
                    m = end - start;
                }
                sum -= arr[start++]; // start 위치의 값을 빼고 start를 증가
            }
        }

        // 최소 길이가 갱신되지 않으면 0 출력
        if (m == 0) {
            System.out.println(0);
        } else {
            System.out.println(m);
        }
    }
}
