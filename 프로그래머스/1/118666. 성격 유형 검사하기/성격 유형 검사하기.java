import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String [] type = {"R","T","C","F","J","M","A","N"};
		ArrayList<String> typeArr = new ArrayList<>(Arrays.asList(type));
		int [] result = new int[8];
		
		int score, idx;
		for (int i = 0; i < survey.length; i++) {
			score = Math.abs(choices[i] - 4);
			idx = choices[i] > 4? typeArr.indexOf(String.valueOf(survey[i].charAt(1))) : typeArr.indexOf(String.valueOf(survey[i].charAt(0)));
			result[idx] += score;
		}
		
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < result.length; i += 2) {
			if(result[i] >= result[i+1]) sb.append(type[i]);
			else sb.append(type[i+1]);
		}
        
        
        return sb.toString();
    }
}