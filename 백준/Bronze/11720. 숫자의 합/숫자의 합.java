import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String rNum = sc.next();
		char[] sNum = rNum.toCharArray();
		int sum=0;
		for(int i=0;i<sNum.length;i++){
			sum += sNum[i] - '0' ;
		}
		System.out.println(sum);
	}
}