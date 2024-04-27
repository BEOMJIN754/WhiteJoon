import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();

        int[] count = new int[26];
        char[] split = word.toCharArray();

        // 각 알파벳의 등장 횟수 카운트
        for (int i = 0; i < split.length; i++) {
            int index = split[i] - 'a';
            count[index]++;
        }

        int max = 0; // 가장 많이 나타난 알파벳의 등장 횟수
        char maxAlpha = '?'; // 가장 많이 나타난 알파벳

        // 가장 많이 나타난 알파벳 찾기
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxAlpha = (char) ('A' + i); // 대문자로 변환
            } else if (count[i] == max) {
                maxAlpha = '?'; // 최댓값이 여러 개일 경우 '?' 저장
            }
        }

        System.out.println(maxAlpha);
    }
}