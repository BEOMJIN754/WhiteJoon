import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int prize = 0; // 상금 변수

        if (a == b && b == c) {
            // 3개의 눈이 모두 같은 경우
            prize = 10000 + (a * 1000);
        } else if (a == b || a == c) {
            // 2개의 눈이 같은 경우 (a와 b가 같거나 a와 c가 같은 경우)
            prize = 1000 + (a * 100);
        } else if (b == c) {
            // 2개의 눈이 같은 경우 (b와 c가 같은 경우)
            prize = 1000 + (b * 100);
        } else {
            // 모두 다른 눈인 경우
            int max = Math.max(a, Math.max(b, c));
            prize = max * 100;
        }

        System.out.println(prize);
    }
}
