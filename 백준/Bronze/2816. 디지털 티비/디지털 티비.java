import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roop = Integer.parseInt(br.readLine());

        List<String> a = new ArrayList<>();
        for(int i=0;i<roop;i++) a.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        int kbs1=a.indexOf("KBS1");
        int count =0;
        while(count<kbs1){
            sb.append("1");
            count++;
        }
        while(count>0){
            sb.append("4");
            Collections.swap(a,kbs1,kbs1-1);
            kbs1--;
            count--;
        }
        int kbs2 = a.indexOf("KBS2");
        while(count<kbs2){
            sb.append("1");
            count++;
        }
        while(count>1){
            sb.append("4");
            Collections.swap(a,kbs2,kbs2-1);
            kbs2--;
            count--;
        }
        System.out.println(sb.toString());
    }
}