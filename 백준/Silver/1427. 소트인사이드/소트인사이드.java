import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine().trim();  // 입력받은 숫자를 문자열로 처리

        // 각 자리수를 문자열 배열로 변환
        String[] digits = number.split("");
        
        // 내림차순 정렬
        Arrays.sort(digits, Collections.reverseOrder());
        
        // 정렬된 배열을 다시 하나의 문자열로 합침
        StringBuilder sortedNumber = new StringBuilder();
        for (String digit : digits) {
            sortedNumber.append(digit);
        }

        // 결과 출력
        System.out.println(sortedNumber.toString());
    }
}

