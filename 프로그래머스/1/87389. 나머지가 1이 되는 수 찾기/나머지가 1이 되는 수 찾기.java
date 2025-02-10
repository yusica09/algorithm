class Solution {
    public int solution(int n) {
		int res = n-1;
        for (int i = 2; i <= n-1; i++) {
			if((n-1)%i == 0) {
			    res = i;
				break;
			}
		}
        return res;
    }
}