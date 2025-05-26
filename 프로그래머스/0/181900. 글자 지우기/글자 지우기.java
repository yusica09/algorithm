import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < my_string.length(); i++) {
        	boolean check = true;
			for (int j = 0; j < indices.length; j++) {
				if(i==indices[j]) {
					check = false;
				}else if (i < indices[j]) {
	                break;
	            }
			}
			if(check) sb.append(my_string.charAt(i));
		}
        
        return sb.toString();
    }
}