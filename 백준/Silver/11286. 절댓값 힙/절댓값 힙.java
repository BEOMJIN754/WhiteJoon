import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 절댓값 기준으로 정렬하되, 절댓값이 같으면 원래 값으로 비교하는 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) {
                    return Integer.compare(a, b); // 절댓값이 같으면 원래 값 기준 정렬
                }
                return Integer.compare(absA, absB); // 절댓값 기준 정렬
            }
        });

        // 연산 처리
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            
            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll()); // 절댓값이 가장 작은 값 출력 및 제거
                }
            } else {
                pq.add(x); // 값 추가
            }
        }

        scanner.close();
    }
}
