class Solution {
    public String solution(String s) {
        char [] cArr = s.toCharArray();
		StringBuilder sb = new StringBuilder("");

		int cnt = 0;
		for (int i = 0; i < cArr.length; i++) {
			String sub = String.valueOf(cArr[i]);

			if(sub.equals(" ")) { 
				sb.append(" ");
				cnt = 0;
			}
			else if(cnt%2 == 0) {
				sb.append(sub.toUpperCase());
				cnt++;
			}
			else {
				sb.append(sub.toLowerCase());
				cnt++;
			}

		}
		return sb.toString();
    }
}