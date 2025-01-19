import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
		String s = br.readLine();
		
		char[] c = s.toCharArray();
		
		if(c.length==1) {
			System.out.print(c[0]);
			System.out.print(c[0]);
			System.out.println();
		}else {
			System.out.print(c[0]);
			System.out.print(c[c.length-1]);
			System.out.println();
			
		}
		
		}
	}
}
