import java.util.*;
class Solution {
	public static String[] solution(String[] record) {
		
		List<String[]> user = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();
		
		for (int i = 0; i < record.length; i++) {
			String [] splitStr = record[i].split(" ");
			
			String action = splitStr[0];
			String userId = splitStr[1];
			
			if(action.equals("Enter")) {
				String name = splitStr[2];
				hm.put(userId, name);
				String [] s = {action, userId};
				user.add(s);
			}
			else if(action.equals("Leave")) {
				String [] s = {action, userId};
				user.add(s);
			}
			else if(action.equals("Change")) {
				String name = splitStr[2];
				hm.put(userId, name);
			}
		}
				
		String [] res = new String[user.size()];
		
		for (int i = 0; i < user.size(); i++) {
			StringBuilder sb = new StringBuilder("");
			String [] s = user.get(i);
			sb.append(hm.get(s[1]));
			sb.append("님이 ");
			if(s[0].equals("Enter"))
				sb.append("들어왔습니다.");
			else if(s[0].equals("Leave"))
				sb.append("나갔습니다.");
			res[i] = sb.toString();
		}
		
		return res;
	}
}