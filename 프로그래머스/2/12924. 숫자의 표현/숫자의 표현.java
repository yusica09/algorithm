class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int k = 1; k * (k + 1) / 2 <= n; k++) {
            int tmp = n - k * (k - 1) / 2;

            if (tmp % k == 0) {
                int a = tmp / k;
                if (a >= 1) { 
                    answer++;
                }
            }
        }

        return answer;
    }
}