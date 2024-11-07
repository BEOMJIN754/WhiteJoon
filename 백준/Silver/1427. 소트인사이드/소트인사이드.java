import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String num = br.readLine().trim();
        
        String[] arr = num.split("");
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]);
        }
        
    }
}

