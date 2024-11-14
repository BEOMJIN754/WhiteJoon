import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 입력: 배열 A의 크기 N
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        // 두 번째 입력: 배열 A의 요소들
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 A를 오름차순으로 정렬
        Arrays.sort(A);

        // 세 번째 입력: 확인할 숫자의 개수 M
        int M = Integer.parseInt(br.readLine());

        // 네 번째 입력: 배열 B의 요소들에 대해 이분 탐색 수행 및 즉시 출력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            // Arrays.binarySearch()를 통해 target이 배열 A에 있는지 확인
            if (Arrays.binarySearch(A, target) >= 0) {
                System.out.println(1); // 존재하면 1 출력
            } else {
                System.out.println(0); // 존재하지 않으면 0 출력
            }
        }
    }
}
