import java.util.*;
class Solution {
	public int solution(int[] nums) {
		int cnt = 0;
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();

		int sum;
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					if(hm.containsKey(sum)) {
						if(hm.get(sum)) cnt++;
					}
					else {
						boolean prime = isPrime(sum);
						if(prime)
							cnt++;
						hm.put(sum, prime);
					}

				}
			}
		}

		return cnt;
	}

	private boolean isPrime(int sum) {
		for (int i = 2; i <= Math.sqrt(sum); i++) {
			if(sum%i == 0)
				return false;
		}
		return true;
	}
}