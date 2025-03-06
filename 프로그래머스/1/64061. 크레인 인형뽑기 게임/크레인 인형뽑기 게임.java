import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int doll = 0, idx_num, nowIdx, result = 0;

		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean [] zero = new boolean[board[0].length];

		for (int i = 0; i < moves.length; i++) {
			idx_num = moves[i]-1; //1부터이므로 편의상 -1
			if(!zero[idx_num]) { //아직 인형이 남아있는 경우
				doll = 0;
				for (int j = 0; j < board.length; j++) {
					if(board[j][idx_num] != 0) {
						doll = board[j][idx_num];
						board[j][idx_num] = 0;
						break;
					} 
				} //for j

				if(doll == 0) {
					zero[idx_num] = true;
					continue;
				} 
				else {
					arr.add(doll);
					nowIdx = arr.lastIndexOf(doll);

					if(arr.size()>=2) {
						if(arr.get(nowIdx - 1) == doll) {
							arr.remove(nowIdx);
							arr.remove(nowIdx-1);
							result += 2;
						}
					}
				}
			}

		} //for i

		return result;
    }
}