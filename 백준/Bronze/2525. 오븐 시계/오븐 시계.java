import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		int totalMinutes = H * 60 + M + C;

        int newH = (totalMinutes / 60) % 24; 
        int newM = totalMinutes % 60;

        System.out.println(newH + " " + newM);
		}
	}
