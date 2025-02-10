class Solution {
	public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];

        for (int k= 0; k < targets.length; k++) {
			for (int i = 0; i < targets[k].length(); i++) {
				char c = targets[k].charAt(i); 
				int idx = -1;
				
				for (String key : keymap) { //같은 문자 있는지 찾기
					for (int j = 0; j < key.length(); j++) {
						if(c == key.charAt(j))
							if(idx == -1 || idx > j)
								idx = j;
					}
				}
				
				if(idx == -1) { //없을경우
					answer[k] = -1;
					break;
				}
				else {
					answer[k] += idx+1;
				}
			} 
		} 
        return answer;
    }
}