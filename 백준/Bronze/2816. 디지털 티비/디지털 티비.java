import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static void swap(String[] a, int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();

        int cursor = 0;

        int kbs1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("KBS1")) {
                kbs1 = i;
                break;
            }
        }

        while (cursor < kbs1) {
            System.out.print("1");
            cursor++;
        }

        while (kbs1 > 0) {
            System.out.print("4");
            swap(arr, kbs1, kbs1 - 1);
            kbs1--;
            cursor--;
        }

        int kbs2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("KBS2")) {
                kbs2 = i;
                break;
            }
        }

        while (cursor < kbs2) {
            System.out.print("1");
            cursor++;
        }

        while (kbs2 > 1) {
            System.out.print("4");
            swap(arr, kbs2, kbs2 - 1);
            kbs2--;
            cursor--;
        }
    }
}
