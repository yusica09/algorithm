class Solution {
    public String solution(int[] food) {
    	
		StringBuilder sb = new StringBuilder("");
		for (int i = 1; i < food.length; i++) {
			if(food[i] <= 1) continue;
			for (int j = 1; j <= food[i]/2; j++) {
				sb.append(i);
			}
		}
		
		String sb2 = sb.reverse().substring(0);
		sb.reverse();
		sb.append("0");
		sb.append(sb2);
		
		return sb.toString();
    }
}