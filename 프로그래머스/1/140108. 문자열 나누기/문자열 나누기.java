class Solution {
	public int solution(String s) {
        int answer = 0;
		int idx = 1, start = 0, cnt = 1;
		while(idx < s.length()) {
			if(s.charAt(start) == s.charAt(idx)) cnt++;
			else if((idx - start + 1 - cnt) == cnt) {
				answer ++;
				start = idx+1;
				cnt = 0;
			}
			idx++;
		}
		
		if(start < s.length()) answer++;
		
        return answer;
    }
}