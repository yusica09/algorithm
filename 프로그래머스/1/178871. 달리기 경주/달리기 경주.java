import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < answer.length; i++) {
			map.put(players[i], i);
		}
        for (String name : callings) {
        	// 플레이어 순위 변경
			int idx = map.get(name);
			String preName = answer[idx-1];
			answer[idx] = preName;
			answer[idx-1] = name;
			// map 정보 갱신
			map.put(name, idx-1);
			map.put(preName, idx);
		}
        return answer;
    }
}