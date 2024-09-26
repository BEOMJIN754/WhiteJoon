import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			queue.offer(i);
		}
		
		while(true) {
			if(queue.size()==1) {
				break;
			}
			queue.poll();
			queue.offer(queue.poll());
			
		}
		System.out.println(queue.peek());

	}

}
