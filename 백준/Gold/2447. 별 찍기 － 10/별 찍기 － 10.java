import java.util.Scanner;

public class Main {

    // 패턴을 담을 배열 선언
    static char[][] pattern;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        pattern = new char[N][N];

        // 전체 패턴을 공백으로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                pattern[i][j] = ' ';
            }
        }

        // 패턴을 그리는 재귀 함수 호출
        drawPattern(0, 0, N);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(pattern[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
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
