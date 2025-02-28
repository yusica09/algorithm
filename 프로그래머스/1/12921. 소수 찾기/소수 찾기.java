class Solution {
    public static int solution(int n) {
		int answer = 0;
		
		if(n==1) return answer;

		for (int i = 2; i <= n; i++) {
			if(isPrime(i)) answer++;
		}

		return answer;
	}

	public static boolean isPrime(int n) {
		for (int j = 1; j <= Math.sqrt(n); j++) {
			if(j == 1) continue;
			if(n%j == 0) {
				return false;
			}
		}
		return true;
	}
}