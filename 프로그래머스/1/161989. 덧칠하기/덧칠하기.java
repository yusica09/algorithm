class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0, idx = -1;
        for (int i = 0; i < section.length; i++) {
			if(section[i] > idx) {
				idx = section[i] + m - 1;
				answer ++;
			}	
		}
        return answer;
    }
}