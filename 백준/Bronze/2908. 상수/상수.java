import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String a=st.nextToken();
        String b=st.nextToken();
        
        if(extracted(a)>extracted(b)) {
        	System.out.println(extracted(a));
        }else {System.out.println(extracted(b));}
       
    }

	private static int extracted(String a) {
		char[] c1 = a.toCharArray();
        char temp = c1[0];
        c1[0]=c1[c1.length-1];
        c1[c1.length-1]=temp;
        
        String s = new String(c1);
        int i = Integer.parseInt(s);
        return i;
	}
}
