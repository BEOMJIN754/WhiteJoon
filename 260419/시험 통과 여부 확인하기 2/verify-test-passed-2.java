import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt=0;
        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int avg =0;

            for(int j=0;j<4;j++){
                int a = Integer.parseInt(st.nextToken());
                avg+=a;
            }
            if(avg/4>=60) {System.out.println("pass"); cnt++;}
            else{System.out.println("fail");}        
        }
        System.out.println(cnt);
    }
}