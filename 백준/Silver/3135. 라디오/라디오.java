import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 부분
        String[] line = br.readLine().split(" ");
        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);
        
        int N = Integer.parseInt(br.readLine());
        int[] favorites = new int[N];
        for (int i = 0; i < N; i++) {
            favorites[i] = Integer.parseInt(br.readLine());
        }
        
        // 초기 거리: A에서 B까지 직접 이동
        int minPresses = Math.abs(A - B);
        
        // 즐겨찾기 채널을 이용해 계산
        for (int fav : favorites) {
            int presses = 1 + Math.abs(fav - B);
            if (presses < minPresses) {
                minPresses = presses;
            }
        }
        
        System.out.println(minPresses);
    }
}
