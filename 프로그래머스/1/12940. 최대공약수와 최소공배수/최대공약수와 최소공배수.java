class Solution {
	   public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        int maxNum = Math.max(n, m);
	        int minNum = Math.min(n, m);
	        for (int i = 1; i <= minNum; i++) {
				if((n%i == 0) && (m%i == 0) && answer[0] < i)
					answer[0] = i;
			}
	        for (int i = 1; i <= minNum; i++) {
				if((i*maxNum)%minNum == 0) {
					answer[1] = i * maxNum;
					break;
				}
			}
	        
	        return answer;
	    }
}