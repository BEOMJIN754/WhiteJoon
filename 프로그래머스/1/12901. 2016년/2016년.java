class Solution {
    public String solution(int a, int b) {
        
        int[] num = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        int totalDays = 0;
        for(int i=0;i<a-1;i++){
            totalDays += num[i];
        };
        
        int idx = (totalDays + (b-1)+5) %7;
        
        
        String answer = day[idx];
        return answer;
    }
}