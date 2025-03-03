class Solution {
    public int solution(String str1, String str2) {
        int len = str2.length();
		boolean same = false;

		for (int i = 0; i <= str1.length()-len; i++) {
			same = str1.substring(i, i+len).equals(str2);
			
			if(same) break;
		}
		return same? 1:2;
    }
}