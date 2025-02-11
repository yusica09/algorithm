class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		int idx1 = 0, idx2 = 0;
		
		for (String string : goal) {
			if(idx1 < cards1.length && cards1[idx1].equals(string)) { //1번뭉치
					idx1 ++; 
			}
			else if(idx2 < cards2.length && cards2[idx2].equals(string)) {//2번뭉치
					idx2 ++;
			}
			else return "No";
		} 
		return "Yes";
    }
}