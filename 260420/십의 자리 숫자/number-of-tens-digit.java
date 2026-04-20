import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = st.countTokens();
        int[] arr = new int[10];

        for(int i=0; i<num; i++){
            int t = Integer.parseInt(st.nextToken());
            if(t==0)break;
            arr[t/10]++;
        }
        
        for(int i =1;i<10;i++){
            System.out.println(i+" - "+arr[i]);
        }
    }
}