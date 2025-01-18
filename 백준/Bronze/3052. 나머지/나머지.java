import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> remainders = new HashSet<>(); // 서로 다른 나머지를 저장할 HashSet
        
        // 10개의 숫자를 입력받아 처리
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine()); // 숫자 입력
            int remainder = num % 42; // 42로 나눈 나머지 계산
            remainders.add(remainder); // 나머지를 HashSet에 추가
        }

        // HashSet의 크기가 서로 다른 나머지의 개수
        System.out.println(remainders.size());
    }
}
