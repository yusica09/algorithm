import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        boolean [] arr2 = new boolean[arr.length];
        
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				count++;
				arr2[i] = true;
			}
		}
        
        if(count > 0) {
        	int [] answer = new int[count];
        	int idx=0;
        	for (int i = 0; i < arr2.length; i++) {
        		if(arr2[i]) answer[idx++] = arr[i];
        	}
        	
        	return answer;
        }
        else {
        	int [] answer = {-1};
        	
        	return answer;
        }
    }
}