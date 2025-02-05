import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
	public int solution(int a, int b, int c, int d) {
		int answer = 1;
		HashSet<Integer> set = new HashSet<Integer>();
		int beforeSize = set.size();
		int [] num = {a,b,c,d};
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
			if(beforeSize != set.size()) {
				beforeSize = set.size();
				num[i] =0;
			}
		}
		List<Integer> list = new ArrayList<Integer>(set);
		switch (set.size()) {
		case 4:
			answer = Collections.min(list);
			break;
		case 3:
			Arrays.sort(num);
			for (int i = 0; i < list.size(); i++) {
				if(num[3] != list.get(i)) {
					answer *= list.get(i);
				}
			} 
			break;
		case 2:
			Arrays.sort(num);
			if(num[2] == num[3]) 
				if(list.get(0) == num[2])
					answer = (10* list.get(0)+list.get(1)) * (10* list.get(0)+list.get(1));
				else {
					answer = (10* list.get(1)+list.get(0)) * (10* list.get(1)+list.get(0));
				}
			else {
				answer = (list.get(0)+list.get(1)) * Math.abs(list.get(1) - list.get(0));
			}
			break;

		case 1:
			answer = 1111*list.get(0);
			break;
		}
		return answer;
	}

}