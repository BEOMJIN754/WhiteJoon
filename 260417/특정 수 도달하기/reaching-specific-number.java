import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum =0;
        int cnt =0;
        for(int i=0;i<10;i++){
            int a = Integer.parseInt(st.nextToken());
                
            if(a>=250) break;
                sum += a; 
                cnt++;
            }
        System.out.print(sum+" ");
        System.out.printf("%.1f%n",(double) sum/cnt);    
    }
}