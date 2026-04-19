import java.util.*;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum =0;
        int cnt =0;
        for(int i=0;i<10;i++){
            int a = Integer.parseInt(st.nextToken());
            if(a==0) break;
            if(a%2==0){
                sum+=a;
                cnt++;
            }
        }
        System.out.print(cnt + " "+sum );
        }
}