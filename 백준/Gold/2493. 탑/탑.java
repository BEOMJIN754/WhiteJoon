import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 탑의 수
        int[] towers = new int[N]; // 탑 높이 배열
        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장하는 스택

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            towers[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder(); // 결과를 바로 저장할 StringBuilder

        for (int i = 0; i < N; i++) {
            // 스택의 꼭대기 탑이 현재 탑보다 낮으면 제거
            while (!stack.isEmpty() && towers[stack.peek()] < towers[i]) {
                stack.pop();
            }

            // 스택이 비어 있으면 0, 아니면 스택 꼭대기의 인덱스 + 1
            if (stack.isEmpty()) {
                sb.append(0).append(" ");
            } else {
                sb.append(stack.peek() + 1).append(" "); // 1-based index
            }

            stack.push(i); // 현재 탑의 인덱스를 스택에 추가
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}
