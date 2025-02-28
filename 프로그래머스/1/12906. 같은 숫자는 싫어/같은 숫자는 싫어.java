import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> numArr = new ArrayList<Integer>();
		
		numArr.add(arr[0]);
		
		int idx;
		for (int i = 1; i < arr.length; i++) {
			idx = numArr.size()-1;
			if(numArr.get(idx) != arr[i]) {
				numArr.add(arr[i]);
			}
		}
		
		int [] answer = new int[numArr.size()];
		int count = 0;
		
		for (int num : numArr) {
			answer[count++] = num;
		}

        return answer;
    }
}