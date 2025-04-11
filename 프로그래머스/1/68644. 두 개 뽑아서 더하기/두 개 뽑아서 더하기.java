import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				hs.add(numbers[i]+numbers[j]);
			} 
		}
        Integer[] hsArr = hs.toArray(new Integer[0]);
        int[] answer = new int[hs.size()];
        for (int i = 0; i < hsArr.length; i++) {
			answer[i] = hsArr[i];
		}
        
        Arrays.sort(answer);
        return answer;
    }
}