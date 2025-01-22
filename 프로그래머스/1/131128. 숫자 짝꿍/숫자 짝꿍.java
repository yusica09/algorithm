class Solution {
	public static String solution(String X, String Y) {
		int [] xArr = new int [10];
		int [] yArr = new int [10];
		
		for (int i = 0; i < X.length(); i++) {
			int num = (int)(X.charAt(i) - '0');
			xArr[num]++;
		}
		for (int i = 0; i < Y.length(); i++) {
			int num = (int)(Y.charAt(i) - '0');
			yArr[num]++;
		}
		
		boolean res = false;
		StringBuilder result = new StringBuilder("");
		
        for (int i = 9; i >= 0; i--) {
            int cnt = Math.min(xArr[i], yArr[i]);
            for (int j = 0; j < cnt; j++) {
            	if(i == 0 && !res) {
            		result.append(i);
            		res = true;
            		break;
            	}
            	res = true;
                result.append(i);
            }
        }
		
		return res? result.toString() : "-1";
	}
}