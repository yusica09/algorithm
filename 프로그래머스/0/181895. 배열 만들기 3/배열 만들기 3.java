class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int gap_0 = intervals[0][1]-intervals[0][0];
		int gap_1 = intervals[1][1]-intervals[1][0];
		
        int len = gap_0 + gap_1 + 2;
        int[] answer = new int [len];
        
        int start = intervals[0][0];
        for (int i = 0; i <= gap_0; i++) {
			answer[i] = arr[start];
			start++;
		}
        
        start = intervals[1][0];
        for (int i = gap_0+1; i <= gap_0 + gap_1 + 1; i++) {
        	answer[i] = arr[start];
        	start++;
        }
        return answer;
    }
}