class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int success = 0; //성공시간
        int currentHealth = health; //현재체력
        
        for (int i = 0; i < attacks.length; i++) {
        	if(i == 0) {
        		currentHealth -= attacks[i][1];
        	}else {
        		success = attacks[i][0] - (attacks[i-1][0]+1);
        		
        		currentHealth += success*bandage[1];
        		if(success >= bandage[0]) 
        			currentHealth += bandage[2]*(success/bandage[0]);
        		
        		currentHealth = currentHealth >= health? health : currentHealth;
        		currentHealth -= attacks[i][1];
        	}
        	
        	if(currentHealth <= 0) return -1;
		}     
        return currentHealth <= 0? -1 : currentHealth;
    }
}