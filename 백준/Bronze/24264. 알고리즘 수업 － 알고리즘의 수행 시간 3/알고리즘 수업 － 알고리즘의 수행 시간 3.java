import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        long executionCount = (long) n * n;
        
        int polynomialDegree = 2;
        
        System.out.println(executionCount);
        System.out.println(polynomialDegree);
    }
}
