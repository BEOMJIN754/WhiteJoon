import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;

        for (int i = 1; i * (i - 1) / 2 < num; i++) {
            // 연속된 자연수의 첫 항 계산
            int start = (num - (i * (i - 1)) / 2);

            // start가 양수이며, i로 나누어 떨어지는지 확인
            if (start % i == 0 && start > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
