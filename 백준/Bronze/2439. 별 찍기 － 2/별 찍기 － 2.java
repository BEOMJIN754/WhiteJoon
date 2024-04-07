import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            String blank = " ";
            String star = "*";
            for (int a = 1; a <= input - i; a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= i; b++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}