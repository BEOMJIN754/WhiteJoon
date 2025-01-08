import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] A = new int[num];
        int[] B = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer stt = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            B[i] = Integer.parseInt(stt.nextToken());
        }
        
        if (Arrays.equals(A, B)) {
            System.out.println(1);
            return;
        }
        
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {  // 버블 정렬
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    
                    if(A[j]==B[j]&&A[j+1]==B[j+1]&&Arrays.equals(A, B)) {
                    	System.out.println(1);
                    	return;
                    }
                }
            }

        }
            System.out.println(0);
    }
}
