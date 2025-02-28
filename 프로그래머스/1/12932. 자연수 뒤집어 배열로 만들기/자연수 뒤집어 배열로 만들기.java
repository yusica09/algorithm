class Solution {
    public int[] solution(long n) {
        String strN = String.valueOf(n);
        int[] answer = new int[strN.length()];
        
        int idx = 0;
        answer[idx++] = (int) (n%10);
        while ((n = n/10) > 0) {
        	answer[idx++] = (int) (n%10);
		}
        
        return answer;
    }
}