import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        int cnt = 0;
        int half = nums.length /2;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.add(num)){
                cnt++;
            }
        }
        if(cnt>half){cnt = half;}
        int answer = cnt;
        return answer;
    }
}