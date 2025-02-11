class Solution {
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
        	if(Character.isUpperCase(c)) 
        		sb.append((char)((c +n - 'A') % 26 + 'A')); 
        	else if(Character.isLowerCase(c))
        		sb.append((char)((c +n - 'a')% 26 + 'a'));
        	else sb.append(c);
		}
        return sb.toString();
    }
}