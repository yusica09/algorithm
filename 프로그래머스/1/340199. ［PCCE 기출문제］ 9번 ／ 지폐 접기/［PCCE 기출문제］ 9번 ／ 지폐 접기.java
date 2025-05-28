class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
		int wallet_min = Math.min(wallet[0], wallet[1]);
		int wallet_max = Math.max(wallet[0], wallet[1]);

		boolean check = false;
		while(!check) {
			if((wallet_min >= bill[0] && wallet_max >= bill[1]) || 
					(wallet_min >= bill[1] && wallet_max >= bill[0])) {
				check = true;
			}else {
				if (bill[0] >= bill[1]) {
		            bill[0] /= 2;
		        } else {
		            bill[1] /= 2;
		        }
				answer++;
			}
		}
		return answer;
    }
}