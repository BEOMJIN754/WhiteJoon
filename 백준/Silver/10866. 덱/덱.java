import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.startsWith("push_front")) {
                int x = Integer.parseInt(input.split(" ")[1]);
                dq.addFirst(x);
            } else if (input.startsWith("push_back")) {
                int x = Integer.parseInt(input.split(" ")[1]);
                dq.addLast(x);
            } else if (input.equals("pop_front")) {
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
            } else if (input.equals("pop_back")) {
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            } else if (input.equals("size")) {
                sb.append(dq.size()).append("\n");
            } else if (input.equals("empty")) {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
            } else if (input.equals("front")) {
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
            } else if (input.equals("back")) {
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
            }
        }

        System.out.print(sb);
    }
}