import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] cArr = new int[7];
        for(int i=1;i<11;i++){
                cArr[Integer.parseInt(st.nextToken())]++;
        }

        for(int i=1;i<7;i++){
            System.out.println(i+" - "+cArr[i]);
        }
    }
}