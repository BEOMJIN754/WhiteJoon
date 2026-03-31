class Solution {
    public boolean solution(String s) {

        char[] c = s.toCharArray();
        if(c.length==4 || c.length==6){
            for(char a :c){
                if(!Character.isDigit(a))return false;
            }return true;
        }
        return false;
    }
}