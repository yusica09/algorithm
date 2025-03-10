import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        ArrayList<String> id_arr = new ArrayList<>(Arrays.asList(id_list));
        int len = id_list.length;
        
        int[] answer = new int [len];
        //신고한 idx와 신고받은 idx
        int user1_idx, user2_idx;
        boolean [][] state = new boolean[len][len];
        int [] report_count = new int [len];
        
        for (int i = 0; i < report.length; i++) {
        	String [] user_report = report[i].split(" ");
			user1_idx = id_arr.indexOf(user_report[0]);
			user2_idx = id_arr.indexOf(user_report[1]);
			
			//신고기록 저장
			if(state[user1_idx][user2_idx] == false) {
				state[user1_idx][user2_idx] = true;
				report_count[user2_idx]++;
			}
		}
        
        //정지기준 체크
        boolean [] isStop = new boolean [len];
        for (int i = 0; i < len; i++) {
			if(report_count[i] >= k) isStop[i] = true;
		}
        
        //정지된 ID를 신고했는지 확인후 카운트
        for (int i = 0; i < state.length; i++) {
			for (int j = 0; j < state[i].length; j++) {
				// 신고를 했고, 정지라면 AND 연산시 true
				if(state[i][j] && isStop[j] == true)
					answer[i]++;
			}
		}
        
        return answer;
    }
}