import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt=0;
        int n = Integer.parseInt(st.nextToken());
       st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
 
            int a = Integer.parseInt(st.nextToken());
            if(a%2==0){
                arr[cnt]=a;
                cnt++;
            }
        }

        for(int i=0;i<cnt;i++){
            System.out.print(arr[cnt-1-i]+" ");
        }
    }
}