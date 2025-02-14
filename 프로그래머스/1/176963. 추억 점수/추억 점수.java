import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int [] answer = new int[photo.length];
		
		HashMap<String, Integer> score = new HashMap<String, Integer>();
		
		for (int i = 0; i < name.length; i++) {
			score.put(name[i], yearning[i]);
		}
		
		for (int i = 0; i < photo.length; i++) {
			for (String person : photo[i]) {
				if(score.containsKey(person))
					answer[i] += score.get(person);
			}
		} 
		
		return answer;
    }
}