import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt =0;
        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            int a = Integer.parseInt(st.nextToken());
            if(a==0) break;
            else{}
            arr[i] = a;
            cnt++;}
        for(int i=0;i<cnt;i++){
            System.out.print(arr[cnt-1-i]+" ");
        }
        }



}