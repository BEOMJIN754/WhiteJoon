import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 투 포인터 알고리즘
        int start = 0, end = 0, sum = 0, minLength = Integer.MAX_VALUE;

        while (true) {
            // 조건을 만족하면 최소 길이 갱신 후 start 이동
            if (sum >= S) {
                minLength = Math.min(minLength, end - start);
                sum -= arr[start];
                start++;
            }
            // 조건을 만족하지 못하면 end 이동
            else if (end < N) {
                sum += arr[end];
                end++;
            }
            // 배열 범위를 초과하면 종료
            else {
                break;
            }
        }

        // 결과 출력 (minLength가 갱신되지 않으면 0 출력)
        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}
