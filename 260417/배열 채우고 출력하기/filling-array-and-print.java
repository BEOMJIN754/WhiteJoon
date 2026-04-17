import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().replace(" ","").toCharArray();
        for(int i=9; i>=0;i--){
            System.out.print(arr[i]);
        }


    }
}