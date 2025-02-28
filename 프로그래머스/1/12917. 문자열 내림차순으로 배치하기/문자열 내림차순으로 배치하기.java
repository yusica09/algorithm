import java.util.*;
class Solution {
    public String solution(String s) {
        char [] c = s.toCharArray();
        Arrays.sort(c);
        
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < c.length; i++) {
			sb.append(c[i]);
		}
        
        return sb.reverse().toString();
    }
}