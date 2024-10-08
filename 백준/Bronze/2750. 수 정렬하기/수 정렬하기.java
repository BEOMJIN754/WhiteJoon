import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 수의 개수 입력
        int[] arr = new int[N];

        // 배열에 수 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 버블 정렬 구현
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 인접한 두 수를 비교하여 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 정렬된 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
