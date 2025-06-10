class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int count = 0, zeroCount = 0;
        for (int i : lottos) {
        	if(i == 0) {
        		zeroCount ++;
        		continue;
        	}
			for (int j : win_nums) {
				if(i == j) count ++;
			}
		}
        
        answer[1] = count == 0? 6 : 7 - count;
        answer[0] = answer[1] - zeroCount <= 1? 1 : answer[1] - zeroCount;
        
        return answer;
    }
}