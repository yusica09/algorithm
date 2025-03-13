import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String regx = "1231";
        StringBuilder sb = new StringBuilder("");
        
        for (int i : ingredient) {
			sb.append(i);
		}
              
        while(sb.indexOf(regx) != -1) {
        	findDelete(sb,regx);
        	answer ++;
        }
        return answer;
    }
    private static void findDelete(StringBuilder sb, String regx) {
		int idx = sb.indexOf(regx);
    	sb.delete(idx, idx+4);
	}
}