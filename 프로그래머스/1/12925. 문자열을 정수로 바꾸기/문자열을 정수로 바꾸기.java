class Solution {
    	public static int solution(String s) {
        int answer = 0;
        
        if(s.charAt(0) == '-' || s.charAt(0) == '+') {
        	answer = Integer.parseInt(s.substring(1)) * (s.charAt(0) == '-' ? -1:1); 
        }
        else answer = Integer.parseInt(s);
        
        return answer;
    }
}