import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		
		if(A>=90) System.out.println("A");
		else if(90>A&&A>=80) System.out.println("B");
		else if(80>A&&A>=70) System.out.println("C");
		else if(70>A&&A>=60) System.out.println("D");
		else System.out.println("F");
		
	}
}