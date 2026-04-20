import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int t = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        int[] cArr = new int[d];

        while(t>1){
            cArr[t%d]++;
            t = t/d;
        }

        int sum =0;
        for(int i=0;i<cArr.length;i++){
            sum += cArr[i]*cArr[i];
        }
        System.out.println(sum);
    }
}