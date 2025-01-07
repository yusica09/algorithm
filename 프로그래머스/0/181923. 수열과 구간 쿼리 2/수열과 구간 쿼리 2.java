class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
        	int k = queries[i][2];
        	int res = -1;
        	for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if(arr[j] > k && res == -1) res = arr[j];
				else if(arr[j] > k && res > arr[j]) res = arr[j];
			}
        	answer[i] = res;
		}
        return answer;
    }
}