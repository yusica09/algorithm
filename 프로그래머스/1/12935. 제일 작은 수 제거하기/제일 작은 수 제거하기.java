import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
        	int[] one = {-1};
        	return one;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        Arrays.sort(arr);
        int idx = list.indexOf(arr[0]);
        list.remove(idx);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}