import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
		for (int i : d) {
			total += i;
		}
		if(total <= budget) {
			return d.length;
		}
        
        int count = 0;
        Arrays.sort(d);
        while(budget > 0) {
        	if(budget - d[count] >= 0) {
        		budget -= d[count];
        		count ++;
        	}else {
        		break;
        	}
        }
        
        return count;
    }
}