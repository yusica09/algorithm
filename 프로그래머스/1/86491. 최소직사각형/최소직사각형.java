class Solution {
    public int solution(int[][] sizes) {
       int x = Math.max(sizes[0][0], sizes[0][1]);
		int y = Math.min(sizes[0][0], sizes[0][1]);
		
		for (int i = 1; i < sizes.length; i++) {
			if(sizes[i][0] > sizes[i][1]) {
				x = Math.max(x, sizes[i][0]);
				y = Math.max(y, sizes[i][1]);
			}else {
				x = Math.max(x, sizes[i][1]);
				y = Math.max(y, sizes[i][0]);
			}
		}
		return x * y;
    }
}