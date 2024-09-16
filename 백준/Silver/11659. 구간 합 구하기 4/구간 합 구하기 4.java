import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수의 개수 N과 합을 구해야 하는 횟수 M을 입력 받음
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // N개의 수를 입력받기 위한 배열과 구간 합을 저장할 배열
        int[] arr = new int[N];
        int[] S = new int[N + 1]; // S[0]을 0으로 두어 첫 구간에서 인덱스 문제를 해결
        
        // N개의 수 입력과 동시에 구간 합을 계산
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            S[i + 1] = S[i] + arr[i];
        }
        
        // M번의 구간을 입력받아 해당 구간의 합을 출력
        for (int k = 0; k < M; k++) {
            int F = sc.nextInt();
            int E = sc.nextInt();
            
            // 구간 합을 구하여 출력 (S[E]에서 S[F-1]을 빼면 F~E 구간 합이 됨)
            System.out.println(S[E] - S[F - 1]);
        }

        sc.close();
    }
}
