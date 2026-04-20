import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
        int[] cArr = new int[4];

        for(int i=0; i<3;i++){
         st = new StringTokenizer(br.readLine());
          if(st.nextToken().equals("Y")){
            if(Integer.parseInt(st.nextToken())>=37) cArr[0]++;
            else cArr[2]++; 
          }
          else{
            if(Integer.parseInt(st.nextToken())>=37) cArr[1]++;
            else cArr[3]++;
          }
        }
        for(int i=0; i<4;i++){
            System.out.print(cArr[i]+" ");
        }
        if(cArr[0]>=2) System.out.print("E");
    }
}