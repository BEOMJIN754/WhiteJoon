import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int count = 0; // 약수 개수를 세는 변수
        int result = 0; // K번째 약수를 저장할 변수
        
        // 1부터 N까지 순회하면서 N의 약수를 찾음
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // i가 N의 약수인 경우
                count++; // 약수 개수 증가
                if (count == K) { // 찾고자 하는 K번째 약수인 경우
                    result = i; // 결과 변수에 저장
                    break; // 더 이상 탐색할 필요가 없으므로 반복문 종료
                }
            }
        }
        
        // 결과 출력
        System.out.println(result);
    }
}