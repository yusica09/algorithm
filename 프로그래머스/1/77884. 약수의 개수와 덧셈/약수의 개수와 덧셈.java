class Solution {
   public int solution(int left, int right) {
		int answer = 0;
		
		for (int i = left; i <= right; i++) {
			int count = 0;
			if(i == 1) count = 1;
			else if(i == 2) count = 2;
			else {
				for (int j = 2; j <= i/2; j++) {
					if(i%j == 0) count++;
				}
			}
			answer = count%2 == 0? answer + i : answer - i;
		}
		
		return answer;
    }
}