import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    // 패턴을 담을 배열 선언
    static char[][] pattern;

    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        pattern = new char[N][N];

        // 전체 패턴을 공백으로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                pattern[i][j] = ' ';
            }
        }

        // 패턴을 그리는 재귀 함수 호출
        drawPattern(0, 0, N);

        // 결과 출력을 위한 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(pattern[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    // 패턴을 그리는 재귀 함수
    static void drawPattern(int x, int y, int n) {
        // 베이스 케이스: n이 1일 경우 별을 찍는다
        if (n == 1) {
            pattern[x][y] = '*';
            return;
        }

        // 다음 패턴의 크기는 n / 3
        int size = n / 3;

        // 3x3의 격자를 돌며 패턴을 그린다
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 가운데 부분은 비워둔다
                if (i == 1 && j == 1) {
                    continue;
                }
                // 나머지 부분에 대해 재귀 호출
                drawPattern(x + i * size, y + j * size, size);
            }
        }
    }
}

