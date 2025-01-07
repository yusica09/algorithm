class Solution {
	public long solution(int k, int d) {
        long count = 0;
        for (int i = 0; i <=d; i+=k) {
        	int maxIdx = (int)Math.sqrt((long)d*d - (long)i*i);
        	maxIdx = (maxIdx / k) * k;
        	count += (maxIdx / k) + 1; 
		}
        return count;
    }
}