import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] one = new int[R][C];
        for(int i=0; i<R;i++){
            for(int j=0;j<C;j++){
                one[i][j] = sc.nextInt();
            }
        }
        int[][] two = new int[R][C];
        for(int i=0; i<R;i++){
            for(int j=0;j<C;j++){
                two[i][j] = sc.nextInt();
            }
        }
        int[][] three = new int[R][C];
        for(int i=0; i<R;i++){
            for(int j=0;j<C;j++){
                three[i][j] = one[i][j] + two[i][j];
            }
        }
        for(int i=0; i<R;i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(three[i][j] + " ");
            }
            System.out.println();
        }
        }
    }