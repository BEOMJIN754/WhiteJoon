import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine());

     int n = Integer.parseInt(st.nextToken());
     double g = 0.0;

    st = new StringTokenizer(br.readLine());
     for(int i=0;i<n;i++){
        g+=Double.parseDouble(st.nextToken());
     }
    double avg = g/n;
    System.out.printf("%.1f%n",avg);
    if(avg>4.0) System.out.println("Perfect");
    else if(avg>3.0) System.out.println("Good");
    else System.out.println("Poor");


    }
}