import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> test = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                test.add(arr[i]);
            }
        }
        
        if(test.size() == 0){
            return new int[]{-1};
        }
        
        Collections.sort(test);
        
        int[] answer = new int[test.size()];
        for(int i=0; i<test.size(); i++){
            answer[i] = test.get(i);
        }
        
        return answer;
    }
}