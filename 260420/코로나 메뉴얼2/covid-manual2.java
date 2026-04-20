import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cArr = new int[4];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean isY = st.nextToken().equals("Y");
            boolean isHigh = Integer.parseInt(st.nextToken()) >= 37;

            if (isY && isHigh)       cArr[0]++;
            else if (!isY && isHigh) cArr[1]++;
            else if (isY)            cArr[2]++;
            else                     cArr[3]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int c : cArr) sb.append(c).append(" ");
        if (cArr[0] >= 2) sb.append("E");

        System.out.println(sb.toString().trim());
    }
}