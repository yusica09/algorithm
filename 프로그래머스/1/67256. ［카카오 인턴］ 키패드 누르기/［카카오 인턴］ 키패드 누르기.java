class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder("");

		hand = String.valueOf(hand.charAt(0)).toUpperCase();
		int left = 10, right = 12;

		for (int i = 0; i < numbers.length; i++) {
			
			int num = numbers[i]==0? 11:numbers[i];
			
			if(num%3 == 1) {
				sb.append("L");
				left = num;
			}
			else if(num%3 == 0) {
				sb.append("R");
				right = num;
			}
			else if(num%3 == 2) {
				if(calcDistance(num,left) < calcDistance(num,right)) {
					sb.append("L");
					left = num;
				}
				else if(calcDistance(num,left) == calcDistance(num,right)) {
					sb.append(hand);
					if(hand.equals("L")) left = num;
					else right = num;
				}
				else {
					sb.append("R");
					right = num;
				}
			}
		} 

		return sb.toString();
	}
    private static int calcDistance(int i, int hand) {
		if(hand%3 == 2)
			return  Math.abs((i-1)/3 - (hand-1)/3);
		else
			return  1 + Math.abs((i-1)/3 - (hand-1)/3);
	}
}