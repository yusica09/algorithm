class Solution {
        public int solution(int number, int limit, int power) {
    	
        int answer = 0;
		int num,end;
		double sqrt;

		for (int i = 1; i <= number; i++) {
			num = 0;
			sqrt = Math.sqrt(i);
			end = (int) Math.sqrt(i);
			for (int j = 1; j <= end; j++) {
				if(i%j == 0) {
					if(j != sqrt) num += 2;
					else num += 1;
				}
			}
			if(num <= limit) answer += num;
			else answer += power;
		} 
        
        return answer;
    }
}