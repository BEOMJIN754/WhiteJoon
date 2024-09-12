import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[sc.nextInt()];
		sc.nextLine();
		String num = sc.nextLine();
		String[] digit = num.split("");
		int sum = 0;
		for(int i=0;i<digit.length;i++) {
			sum += Integer.parseInt(digit[i]);
		}
		System.out.println(sum);
	}

}
