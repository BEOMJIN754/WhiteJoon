import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		int limit = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==limit &&i!=j) {
					count++;
				}
			}
		}
	
		System.out.println(count);
	}

}
