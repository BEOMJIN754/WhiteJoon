import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();
        
        int Y = findNextSpecialYear(X);
        System.out.println(Y);
    }

    public static int findNextSpecialYear(int X) {
        for (int year = X + 1; year <= 9999; year++) {
            int front = year / 100; // 앞 두 자리
            int back = year % 100;  // 뒤 두 자리
            
            if ((front + back) * (front + back) == year) {
                return year;
            }
        }
        return -1; // 조건을 만족하는 연도가 없는 경우
    }
}
