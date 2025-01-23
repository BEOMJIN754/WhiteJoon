import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	int lcm = m*b / gcd(m,b);
    	
    	int a1 = n*(lcm/m) + a*(lcm/b);
    	
    	int aa= gcd(lcm,a1);
    	int rc = lcm/aa;
    	int lc = a1/aa;
    	
    	
    	
    	System.out.println(lc+" "+rc);
    	
    	}
    
    	public static int gcd(int a,int b) {
    		while(b!=0) {
    			int temp =b;
    			b = a%b;
    			a = temp;
    		}
    		return a;
    	}
    	
    }

