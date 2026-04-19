import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Double sum =0.0;
        for(int i=0;i<8;i++){
            sum += Double.parseDouble(st.nextToken());
        }
        System.out.printf("%.1f%n",sum/8);
    }
}