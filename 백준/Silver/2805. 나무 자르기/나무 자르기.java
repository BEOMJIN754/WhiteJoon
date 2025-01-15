import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(trees);

        long result = binary(trees, m, trees[n - 1]);
        System.out.println(result);
    
    }

	private static long binary(int[] trees, long b, int max) {
		long start =0 ,end =max;
		long result =0;
		
		while(start<=end) {
			long mid = (start+end)/2;
			
			long wood = calculate(trees,mid);
		
			if(wood>=b) {
				result =mid;
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return result;
	}

	private static long calculate(int[] trees, long mid) {
		long total=0;
		for(int tree:trees) {
			if(tree>mid) total += tree-mid;
		}
		return total;
	}
}
