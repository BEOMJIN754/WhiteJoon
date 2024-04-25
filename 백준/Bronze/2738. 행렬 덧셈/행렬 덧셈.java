import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 행렬의 크기 N, M 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 행렬 A 입력 받기
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 행렬 B 입력 받기
        int[][] B = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 행렬 A와 B를 더하여 결과 행렬 C 구하기
        int[][] C = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // 결과 행렬 C 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(C[i][j]);
                if (j < M - 1) {
                    System.out.print(" "); // 원소 사이 공백 출력
                }
            }
            System.out.println(); // 각 행의 끝에 개행 출력
        }

        scanner.close();
    }
}