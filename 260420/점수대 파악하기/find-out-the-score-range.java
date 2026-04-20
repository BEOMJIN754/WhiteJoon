import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cArr = new int[10];

        int ct = 0;
        for(int i=0;i<100;i++){
            int n = Integer.parseInt(st.nextToken());
            if(n==0)break;
            if(n/10==10)ct ++;
            else {cArr[n/10]++;
            }
        }
        System.out.println("100 - "+ct);
        for(int i=9;i>0;i--){
          System.out.println(i+"0 - "+cArr[i]);  
        }

    }
}