class Solution {
    public String solution(String s, String skip, int index) {
		StringBuilder sb = new StringBuilder("");
		char [] cArr = s.toCharArray();

		for (int i = 0; i < cArr.length; i++) {
			char c = cArr[i];
			sb.append(change(c,skip,index));
		}

		return sb.toString();
	}


	private static char change(char c, String skip, int index) {
		for (int i = 0; i < index; i++) {
			do {
				c = (char)((c - 'a' + 1)%26 + 'a' );
			} while (skip.indexOf(c) != -1); 
		}
		return c;
	}
}