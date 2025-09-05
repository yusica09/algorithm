class Solution {
    public int solution(int n, int k) {
        int price = 12000;
        int drinkPrice = 2000;

        int service = n / 10;

        int total = (price * n) + (drinkPrice * (k - service));
        
        return total;
    }
}