import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N이 주어진다.
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 상근이가 가진 숫자 카드를 정렬
        Arrays.sort(arr);
        
        // 셋째 줄에는 M이 주어진다.
        int M = scanner.nextInt();
        int[] input = new int[M];
        for(int i = 0; i < M; i++) {
            input[i] = scanner.nextInt();
        }
        
        // 각 input 값에 대해 이진 탐색 수행
        for(int i = 0; i < M; i++) {
            if(Arrays.binarySearch(arr, input[i]) >= 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
        
        scanner.close();
    }
}
