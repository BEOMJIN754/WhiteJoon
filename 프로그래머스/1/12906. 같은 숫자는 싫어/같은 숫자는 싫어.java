import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> ar = new ArrayList<>();
        for(int num:arr){
            if(ar.isEmpty() || ar.get(ar.size()-1) != num){
                ar.add(num);
            }
        }
        int[] answer = new int[ar.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = ar.get(i);
        }
        



        return answer;
    }
}