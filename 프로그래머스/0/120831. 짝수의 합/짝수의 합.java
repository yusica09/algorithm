class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0;i <= n; i++){
            answer = i%2==0? answer+i : answer;
        }
        return answer;
    }
}