class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        if(num == (int)Math.sqrt(n)) {
        	return (long) ((num+1)*(num+1));
        }
        
        return -1;
    }
}