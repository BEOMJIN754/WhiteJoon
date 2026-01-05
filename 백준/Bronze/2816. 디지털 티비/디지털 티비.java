import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) a[i] = br.readLine();

        StringBuilder sb = new StringBuilder();

        int idx1 = find(a, "KBS1");
        for (int i = 0; i < idx1; i++) sb.append('1');
        for (int i = idx1; i > 0; i--) {
            swap(a, i, i - 1);
            sb.append('4');
        }

        int idx2 = find(a, "KBS2");
        for (int i = 0; i < idx2; i++) sb.append('1');
        for (int i = idx2; i > 1; i--) {
            swap(a, i, i - 1);
            sb.append('4');
        }

        System.out.print(sb.toString());
    }

    static int find(String[] a, String target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(target)) return i;
        }
        return -1;
    }

    static void swap(String[] a, int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
