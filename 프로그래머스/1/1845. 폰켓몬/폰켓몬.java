import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        // distinct().count()는 long 반환 → int로 캐스팅
        int distinctCount = (int) Arrays.stream(nums).distinct().count();
        return Math.min(distinctCount, nums.length / 2);
    }
}