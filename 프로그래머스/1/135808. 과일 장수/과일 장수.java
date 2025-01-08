class Solution {
	public int solution(int k, int m, int[] score) {
        int [] scoreArr = new int[k+1];
        for(int num:score) {
        	scoreArr[num]++;
        }
       int maxScore=0; int appleNum = score.length;
        while(appleNum >= m) {
        	int sum = 0;
            for (int i = scoreArr.length-1; i > 0; i--) {
            	sum += scoreArr[i];
            	scoreArr[i] = 0;
    			if(sum >= m) {
    				scoreArr[i] = sum - m;
    				appleNum -= m;
    				maxScore += i*m;
    				break;
    			}
    		}
        }
        
        return maxScore;
    }
}