
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        long max = 1;
        long layer =1;

        while(n>max){
            max += 6*layer;
            layer++;
        }
        System.out.println(layer);
    }
}