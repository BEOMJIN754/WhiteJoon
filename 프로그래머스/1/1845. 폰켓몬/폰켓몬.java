import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        
                return Math.min(hash.size(), nums.length / 2);
    }
}