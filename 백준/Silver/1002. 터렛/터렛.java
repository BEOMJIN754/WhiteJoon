import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x1 = Long.parseLong(st.nextToken());
            long y1 = Long.parseLong(st.nextToken());
            long r1 = Long.parseLong(st.nextToken());
            long x2 = Long.parseLong(st.nextToken());
            long y2 = Long.parseLong(st.nextToken());
            long r2 = Long.parseLong(st.nextToken());

            long dx = x1 - x2;
            long dy = y1 - y2;
            long d2 = dx * dx + dy * dy;
            long sum = r1 + r2;
            long diff = Math.abs(r1 - r2);
            long sum2 = sum * sum;
            long diff2 = diff * diff;

            if (d2 == 0 && r1 == r2) sb.append(-1).append('\n');
            else if (d2 > sum2) sb.append(0).append('\n');
            else if (d2 < diff2) sb.append(0).append('\n');
            else if (d2 == sum2 || d2 == diff2) sb.append(1).append('\n');
            else sb.append(2).append('\n');
        }
        System.out.print(sb.toString());
    }
}
