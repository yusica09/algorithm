import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public int[] solution(int l, int r) {
		List<Integer> answer = new ArrayList<Integer>();
		int len = String.valueOf(r).length();

		int allCase = (int) Math.pow(2,len);
		for (int i = 1; i <= allCase; i++) {
			StringBuilder sb = new StringBuilder(); 
			String binaryNum = Integer.toBinaryString(i);
			for (int j = 0; j < binaryNum.length(); j++) {
				if(binaryNum.charAt(j) == '0')
					sb.append("0");
				else
					sb.append("5");
			}
			int resNum = Integer.parseInt(sb.toString());
			if(resNum >= l && resNum <= r )
				answer.add(resNum);
		}
		
		int[] res = new int[answer.size()];
		for (int i = 0; i < answer.size(); i++) {
		    res[i] = answer.get(i);
		}
		
		return res.length == 0 ? new int[]{-1} : res;
	}
}