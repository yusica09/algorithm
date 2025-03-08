class Solution {
    public String solution(String my_string, int s, int e) {
        String subStr = my_string.substring(s,e+1);
        StringBuilder sb = new StringBuilder(subStr);
        
        sb = sb.reverse();
        String result = my_string.substring(0,s) + sb.toString();
        
        if(result.length() < my_string.length()) {
        	result += my_string.substring(e+1);
        }
        
        return result;
    }
}