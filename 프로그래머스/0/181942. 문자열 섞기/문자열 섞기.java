class Solution {
    public String solution(String str1, String str2) {
        String fusion ="" ; 
        for(int i =0; i<str1.length(); i++) {       fusion = fusion + str1.charAt(i) + str2.charAt(i);
                                               
        }
        
        
        String answer = fusion;
        return answer;
    }
}