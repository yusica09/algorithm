class Solution {
    public int solution(String[][] board, int h, int w) {
        String target = board[h][w];
        int count = 0, x,y;
        int len = board.length;
        
        int [][] check = {{1,0},{-1,0},{0,1},{0,-1}};
        
        for (int i = 0; i < check.length; i++) {
			x = check[i][0] + h;
			y = check[i][1] + w;
			
			if(x < 0 || y < 0 || x >= len || y >= len) continue;
			
			if(board[x][y].equals(target)) count++;
			
		}
        
        return count;
    }
}