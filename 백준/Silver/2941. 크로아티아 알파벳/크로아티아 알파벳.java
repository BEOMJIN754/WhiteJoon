import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] cro = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String c : cro) {
            line = line.replace(c, "A");
        }

        System.out.println(line.length());
    }
}
