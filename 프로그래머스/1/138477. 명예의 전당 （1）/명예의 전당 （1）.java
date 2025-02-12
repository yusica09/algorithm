import java.util.*;
class Solution {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] top = new int[k];
        for (int i = 0; i < score.length; i++) {
			if(i < k) {
				Arrays.sort(top);
				top[0] = score[i];
				Arrays.sort(top);
				answer[i] = top[k-1-i];
			}
			else {
				Arrays.sort(top);
				if(top[0] < score[i]) top[0] = score[i];
				Arrays.sort(top);
				answer[i] = top[0];
			}
		} 
        return answer;
    }
}