import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력받을 숫자의 개수
        int[] arr = new int[n];
        long max = 0;  // 최댓값을 저장할 변수
        double sum = 0;  // 합계를 저장할 변수

        // 입력값을 배열에 저장하면서 최댓값 찾기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 각 숫자를 최댓값으로 나누고 100을 곱해 합산
        for (int i = 0; i < n; i++) {
            sum += (double) arr[i] / max * 100;  // 실수 나눗셈을 위해 (double)로 캐스팅
        }

        // 평균값 출력
        System.out.println(sum / n);
    }
}
