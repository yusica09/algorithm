class Solution {
    public long solution(long n) {
        int[] num = new int[10];
        
        num[(int) (n%10)]++;
        
        while((n = n/10) > 0) {
        	num[(int) (n%10)]++;
        }
        
        StringBuilder sb = new StringBuilder("");
        for (int i = num.length-1; i >= 0; i--) {
			sb.append(String.valueOf(i).repeat(num[i]));
		} 
        
        return Long.parseLong(sb.toString());
    }
}