import java.util.*;
class Solution {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		int col_num=0, cnt = 0, sort_num;
		
		col_num = changeStrToNum(ext);
		sort_num = changeStrToNum(sort_by);
		
		int [] sortNum = {sort_num};

		for (int i = 0; i < data.length; i++) {
			if(data[i][col_num] < val_ext) cnt++;
		}
		
		int[][] answer = new int[cnt][data[0].length];
		
		for (int i = 0; i < data.length; i++) {
			if(data[i][col_num] < val_ext) {
				answer[--cnt] = data[i];
			} 
		}
		
		Arrays.sort(answer, (o1, o2) -> Integer.compare(o1[sortNum[0]],o2[sortNum[0]]));

		return answer;
	}



	private static int changeStrToNum(String ext) {
		switch (ext.charAt(0)) {
		case 'c': return 0;
		case 'd': return 1;
		case 'm': return 2;
		case 'r': return 3;
		default : return 0;
		}
	}
}