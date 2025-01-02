class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String c = String.valueOf(a);
        String d = String.valueOf(b);
        
        int ans1 = Integer.parseInt(c+d);
        int ans2 = 2*a*b;
        
        answer = Math.max(ans1, ans2);
        
        return answer;
    }
}