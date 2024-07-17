import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // 예제 반례 배열 생성
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = (i % 2 == 0) ? N - i / 2 : i / 2 + 1;
        }
        
        // 배열 출력
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}