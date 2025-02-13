import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            // 데이터가 처리될 컴퓨터 번호 계산
            int result = computeLastComputer(a, b);
            System.out.println(result);
        }

        scanner.close();
    }

    public static int computeLastComputer(int a, int b) {
        // 10으로 나눈 나머지를 이용하여 패턴을 찾는다.
        int base = a % 10;

        if (base == 0) return 10; // 0번 컴퓨터는 없으므로 10번 컴퓨터가 담당

        // 주어진 숫자의 패턴을 찾는다.
        int[] pattern = new int[4];
        pattern[0] = base;
        for (int i = 1; i < 4; i++) {
            pattern[i] = (pattern[i - 1] * base) % 10;
            if (pattern[i] == pattern[0]) { // 주기가 반복되면 종료
                return pattern[(b - 1) % i];
            }
        }

        return pattern[(b - 1) % 4]; // 패턴의 주기를 고려하여 결과 반환
    }
}
