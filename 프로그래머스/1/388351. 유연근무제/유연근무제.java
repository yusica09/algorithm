class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        //희망 출근시간 + 10 한 값을 주어진 배열에 넣고 2차배열 돌면서 확인하기
        for (int i = 0; i < schedules.length; i++) {
			int min = schedules[i] % 100;
			if(min >= 50) {
				schedules[i] = schedules[i] + 100 - min + (min+10)%10;
				if(schedules[i] / 100 == 24) {
					schedules[i] -= 2400;
				}
			}else {
				schedules[i] += 10;
			}
		}
        //startday가 +1씩 반복문을 돌때마다 늘어나는데 주말은 continue 사용
        for (int i = 0; i < timelogs.length; i++) {
        	boolean check = true;
			for (int j = 0, day = startday; j < timelogs[i].length; j++,day++) {
				if(!check) break;
				else if(day == 6 || day == 7){
					if(day == 7) {
						day = 0;
					}
					continue;
				}
				else {
					if(timelogs[i][j] > schedules[i]) check = false;
				}
			}
			if(check) answer++;
        }
        
        return answer;
    }
}