import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int hun = second/100;
        int ten1 = second%100;
        int ten = ten1/10;
        int one1 = ten1%10;

        System.out.println(first*one1);
        System.out.println(first*ten);
        System.out.println(first*hun);
        System.out.println(first*second);
    }
}