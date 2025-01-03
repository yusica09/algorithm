class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int cal = a;
        for(int i=0;i<included.length;i++) {
        	answer = included[i]? answer+cal : answer;
        	cal += d;
        }
        return answer;
    }
}