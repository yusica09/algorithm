class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long)count * (2*price+(count-1)*price)/2 - money;
        return answer > 0 ? answer : 0;
    }
}