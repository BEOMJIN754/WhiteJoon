import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 줄 입력
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();  // 버퍼 비우기
        String table = scanner.nextLine();
        
        // 사람과 햄버거 위치 파악
        char[] positions = table.toCharArray();
        boolean[] eaten = new boolean[N];  // 햄버거가 먹혔는지 여부 표시
        int maxPeople = 0;
        
        // 사람을 순차적으로 탐색하면서 햄버거를 찾음
        for (int i = 0; i < N; i++) {
            if (positions[i] == 'P') {
                // 사람 발견, 거리 K 내에서 햄버거 찾기
                for (int j = Math.max(0, i - K); j <= Math.min(N - 1, i + K); j++) {
                    if (positions[j] == 'H' && !eaten[j]) {
                        eaten[j] = true;  // 햄버거를 먹음
                        maxPeople++;  // 햄버거를 먹은 사람 수 증가
                        break;  // 현재 사람은 햄버거를 먹었으므로 다음 사람으로 이동
                    }
                }
            }
        }
        
        // 결과 출력
        System.out.println(maxPeople);
    }
}