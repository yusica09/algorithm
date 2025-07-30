class Solution {
    public int solution(int num) {
        long n = num;
        if(num == 1) return 0;
        int count = 0;
        
        while(n != 1 && count <= 500) {
        	count++;
        	if(n%2 == 0) n /= 2;
        	else n = n*3 + 1;
        }
        return n == 1? count:-1;
    }
}