class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
		int now_X = -1, now_Y = -1;
		//시작점 찾기
		for (int i = 0; i < park.length; i++) {
			now_Y = park[i].indexOf("S");
			if(now_Y  != -1) {
				now_X = i;
				break;
			}
		}
		//경로 확인
		for (int i = 0; i < routes.length; i++) {
			String [] routes_split = routes[i].split(" ");
			int len = Integer.parseInt(routes_split[1]);
			boolean check = true;
			
			if(routes_split[0].equals("W")) {
				if((now_Y - len) >= park[0].length() || (now_Y - len) < 0) continue;
				for (int j = 1; j <= len; j++) {
					if(park[now_X].charAt(now_Y-j)=='X') {
						check = false;
						break;
					}
				}
				if(check) now_Y -= len;
				
			}else if(routes_split[0].equals("E")) {
				if((now_Y + len) >= park[0].length() || (now_Y + len) < 0) continue;
				for (int j = 1; j <= len; j++) {
					if(park[now_X].charAt(now_Y+j)=='X') {
						check = false;
						break;
					}
				}
				if(check) now_Y += len;
				
			}else if(routes_split[0].equals("S")) {
				if((now_X + len) >= park.length || (now_X + len) < 0) continue;
				for (int j = 1; j <= len; j++) {
					if(park[now_X+j].charAt(now_Y)=='X') {
						check = false;
						break;
					}
				}
				if(check) now_X += len;
				
			}else if(routes_split[0].equals("N")) {
				if((now_X - len) >= park.length || (now_X - len) < 0) continue;
				for (int j = 1; j <= len; j++) {
					if(park[now_X-j].charAt(now_Y)=='X') {
						check = false;
						break;
					}
				}
				if(check) now_X -= len;
			}
		}

		answer[0] = now_X;
		answer[1] = now_Y;
		
		return answer;
    }
}