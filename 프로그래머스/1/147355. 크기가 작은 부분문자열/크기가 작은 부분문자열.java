import java.math.BigInteger;
import java.util.*;

class Solution {
    public static int solution(String t, String p) {
		int answer = 0;
		int len = p.length();
		BigInteger intP = new BigInteger(p);
		
		for (int i = 0; i <= t.length() - len; i++) {
			BigInteger subT = new BigInteger(t.substring(i,i+len));
			if(subT.compareTo(intP) <= 0)
				answer++;
		}

		return answer;
    }
}